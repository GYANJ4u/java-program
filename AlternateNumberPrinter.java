class NumberPrinter {
    private int number = 1;
    private final int MAX = 10;
    private boolean evenTurn = false;

    public synchronized void printOdd() {
        while (number <= MAX) {
            while (evenTurn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Odd Thread: " + number);
            number++;
            evenTurn = true;
            notify();
        }
    }

    public synchronized void printEven() {
        while (number <= MAX) {
            while (!evenTurn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Even Thread: " + number);
            number++;
            evenTurn = false;
            notify();
        }
    }
}

public class AlternateNumberPrinter {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();

        Thread oddThread = new Thread(() -> printer.printOdd());
        Thread evenThread = new Thread(() -> printer.printEven());

        oddThread.start();
        evenThread.start();
    }
}

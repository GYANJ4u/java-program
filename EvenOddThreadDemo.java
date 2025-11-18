// Runnable to print even numbers
class EvenNumberPrinter implements Runnable {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(500); // Sleep to make output easier to follow
            } catch (InterruptedException e) {
                System.out.println("Even thread interrupted.");
            }
        }
    }
}

// Runnable to print odd numbers
class OddNumberPrinter implements Runnable {
    public void run() {
        for (int i = 1; i <= 19; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(500); // Sleep to make output easier to follow
            } catch (InterruptedException e) {
                System.out.println("Odd thread interrupted.");
            }
        }
    }
}

public class EvenOddThreadDemo {
    public static void main(String[] args) {
        // Create Runnable instances
        Runnable evenTask = new EvenNumberPrinter();
        Runnable oddTask = new OddNumberPrinter();

        // Create threads
        Thread evenThread = new Thread(evenTask);
        Thread oddThread = new Thread(oddTask);

        // Start threads
        evenThread.start();
        oddThread.start();
    }
}


class ArrayProcessor {
    private int[] numbers;

    // Constructor
    public ArrayProcessor(int[] numbers) {
        this.numbers = numbers;
    }

    // Thread to calculate the sum
    public Thread getSumThread() {
        return new Thread(() -> {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Sum of array: " + sum);
        });
    }

    // Thread to print array elements
    public Thread getPrintThread() {
        return new Thread(() -> {
            System.out.print("Array elements: ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();
        });
    }
}

public class ArrayThreadDemo {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        ArrayProcessor processor = new ArrayProcessor(data);

        Thread sumThread = processor.getSumThread();
        Thread printThread = processor.getPrintThread();

        // Start both threads
        printThread.start();
        sumThread.start();
    }
}


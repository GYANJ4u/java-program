public class HelloWorldThreads {
    public static void main(String[] args) {
        // Thread to print "Hello" every 2 seconds
        Thread helloThread = new Thread(() -> {
            try {
                while (true) {
                    System.out.println("Hello");
                    Thread.sleep(2000); // Sleep for 2 seconds
                }
            } catch (InterruptedException e) {
                System.out.println("Hello thread interrupted.");
            }
        });

        // Thread to print "World" every 3 seconds
        Thread worldThread = new Thread(() -> {
            try {
                while (true) {
                    System.out.println("World");
                    Thread.sleep(3000); // Sleep for 3 seconds
                }
            } catch (InterruptedException e) {
                System.out.println("World thread interrupted.");
            }
        });

        // Start both threads
        helloThread.start();
        worldThread.start();
    }
}


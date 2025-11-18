public class ExceptionPropagationDemo {

    // Level 3: Method that throws an exception
    static void methodC() {
        // This will throw ArithmeticException (unchecked)
        int result = 10 / 0;
        System.out.println("Result: " + result);
    }

    // Level 2: Calls methodC
    static void methodB() {
        methodC(); // Exception propagates to here
    }

    // Level 1: Calls methodB
    static void methodA() {
        methodB(); // Exception propagates to here
    }

    public static void main(String[] args) {
        try {
            methodA(); // Exception caught here
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e);
        }

        System.out.println("Program continues after exception handling.");
    }
}


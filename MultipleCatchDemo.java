
    public class MultipleCatchDemo {
        public static void main(String[] args) {
            try {
                int[] numbers = {10, 20, 30};
                int result = numbers[5] / 0; // This line will throw ArrayIndexOutOfBoundsException first
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: Division by zero.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException: Invalid array index.");
            } catch (Exception e) {
                System.out.println("Caught some other exception: " + e.getMessage());
            }
    
            System.out.println("Program continues after exception handling.");
        }
    }
    
    


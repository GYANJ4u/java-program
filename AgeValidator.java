// User-defined exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Class to test age validation
public class AgeValidator {
    // Method to check age
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        } else {
            System.out.println("Access granted. Age is valid.");
        }
    }

    // Main method
    public static void main(String[] args) {
        int userAge = 16; // You can change this value to test

        try {
            checkAge(userAge);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}


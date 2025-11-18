// Define the interface
interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
}

// Implement the interface in SavingsAccount
class SavingsAccount implements BankAccount {
    private double balance;

    // Constructor
    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    // Method to check balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

// Main class to test the implementation
public class BankTest {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(500.0);

        account.displayBalance();
        account.deposit(200.0);
        account.withdraw(100.0);
        account.withdraw(700.0); // Should fail
        account.displayBalance();
    }
}


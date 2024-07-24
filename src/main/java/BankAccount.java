public class BankAccount {
    private double balance;
    private String accountHolderName;

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void printAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Balance: $" + balance);
    }

    // Optional: Override toString() method
    @Override
    public String toString() {
        return "Account Holder: " + accountHolderName + ", Account Balance: $" + balance;
    }
}

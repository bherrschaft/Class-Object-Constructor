public class BankTransferMain {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice", 5000);
        BankAccount account2 = new BankAccount("Bob", 300);

        account1.withdraw(100);
        account2.deposit(100);

        System.out.println("Account 1 details:");
        account1.printAccountDetails();

        System.out.println("Account 2 details:");
        account2.printAccountDetails();
    }
}

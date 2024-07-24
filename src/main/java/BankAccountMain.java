public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 500);
        account.deposit(100);
        account.printAccountDetails();
    }
}

class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    private static int totalAccounts = 0;
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        totalAccounts++;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    public void getStatement() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
    public static void showTotalAccounts() {
        System.out.println("Total Accounts Created: " + totalAccounts);
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("1001", "Ali", 5000);
        BankAccount acc2 = new BankAccount("1002", "Sara", 7000);
        BankAccount acc3 = new BankAccount("1003", "John", 10000);

        acc1.deposit(1000);
        acc1.withdraw(500);
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.deposit(500);

        acc2.deposit(1500);
        acc2.withdraw(2000);
        acc2.deposit(1000);
        acc2.withdraw(500);
        acc2.deposit(300);

        acc3.withdraw(3000);
        acc3.deposit(2500);
        acc3.withdraw(1000);
        acc3.deposit(500);
        acc3.withdraw(2000);

        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        BankAccount.showTotalAccounts();
    }
}
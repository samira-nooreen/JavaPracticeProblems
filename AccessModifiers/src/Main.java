
public class Main {
    public static void main(String[] args) {
        Account samAccount = new Account("Sam");
        samAccount.deposite(1000);
        samAccount.withdraw(500);
        samAccount.withdraw(-200);
        samAccount.deposite(-20);
        samAccount.calculateBalance();
        samAccount.balance = 5000;

        System.out.println("Balance of Account is "+samAccount.getBalance());
        samAccount.transactions.add(4500);
        samAccount.calculateBalance();
    }
}
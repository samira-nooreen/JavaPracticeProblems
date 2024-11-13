public class Challenge {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");

        bank.addBranch("Downtown");
        bank.addCustomer("Downtown", "Alice", 100.50);
        bank.addCustomer("Downtown", "Bob", 200.75);

        bank.addTransaction("Downtown", "Alice", 50.25);
        bank.addTransaction("Downtown", "Bob", -30.50);

        bank.listCustomers("Downtown", true);
    }
}


class BankAccount{
    private int accountNumber ;
    private int balance;
    private int phoneNumber;
    private String customerName;
    private String email;


    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;


    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setbalance(int balance){
        this.balance = balance;

    }
    public int getbalance(){
        return balance;
    }
    public void setphoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;

    }
    public int getphoneNumber(){
        return phoneNumber;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;

    }
    public String getCustomerName(){
        return customerName;
    }
    public void setemail(String email){
        this.email=email;
    }
    public String getemail(){
        return email;

    }
    //Methods
    public void DepositFunds(int amount){
       if (amount > 0){
           balance += amount;
           System.out.println("Deposited = "+amount+", New balance = "+balance);
       }else {
           System.out.println("Deposit amount must be positive");
       }
    }
    public void WithdrawFunds(int amount){
         if (amount > 0 && amount <= balance){
             balance -= amount;
             System.out.println("Withdrew = "+amount+", New balance = "+balance);
         }else {
             System.out.println("Invalid withdrawal amount .");
         }
    }

}

public class Bank {
    public static void main(String[] args) {
BankAccount bankAccount = new BankAccount();

bankAccount.setAccountNumber(14);
bankAccount.setCustomerName("Sam");
bankAccount.setemail("Sam@gmail.com");
bankAccount.setphoneNumber(384737468);
bankAccount.setbalance(50000);

        System.out.println("Account Number = "+bankAccount.getAccountNumber());
        System.out.println("Customer Name = "+bankAccount.getCustomerName());
        System.out.println("Email : "+bankAccount.getemail());
        System.out.println("Phone Number = "+bankAccount.getphoneNumber());
        System.out.println("Balance = "+bankAccount.getbalance());

        bankAccount.DepositFunds(2000);
        bankAccount.WithdrawFunds(100);
    }
}

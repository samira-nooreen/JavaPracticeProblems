public class Account{
    private int accountNumber ;
    private double balance;
    private String phoneNumber;
    private String customerName;
    private String email;

    public Account(){
        this(56789,2.50,"Default name","Default address","Default phone");
        System.out.println("Empty constructor called ");
    }

    public Account(String phoneNumber, String customerName, String email) {
        this(9999,100.55,customerName,email,phoneNumber);
        this.phoneNumber = phoneNumber;
        this.customerName = customerName;
        this.email = email;
    }

    public Account(int accountNumber , double balance, String customerName, String email, String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName=customerName;
        this.email = email;
        this.phoneNumber=phoneNumber;

    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;


    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setbalance(double balance){
        this.balance = balance;

    }
    public double getbalance(){
        return balance;
    }
    public void setphoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;

    }
    public String getphoneNumber(){
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
             System.out.println("Withdrew = "+amount+" New balance = "+balance);
         }else {
             System.out.println("Invalid withdrawal amount .");
         }
    }

}

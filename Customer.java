class VipCustomer {
    private String CustomerName;
    private int CustomerCreditLimit;
    private String CustomerEmailAddress;


    public  VipCustomer(String name,int credit,String email){
        CustomerName = name;
        CustomerCreditLimit = credit;
        CustomerEmailAddress = email;
    }
    public VipCustomer(String name,int credit){
        CustomerName = name;
        CustomerCreditLimit = 10;
        CustomerEmailAddress = "You-Email-Address";
    }
    public VipCustomer(){
        CustomerName = "Tom";
        CustomerCreditLimit = 1233;
        CustomerEmailAddress = "Tommy@gmail.com";
    }


    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String Cname) {
        this.CustomerName = Cname;
    }

    public int getCustomerCreditLimit() {
        return CustomerCreditLimit;
    }

    public void setCustomerCreditLimit(int Climit) {
        this.CustomerCreditLimit = Climit;
    }

    public String getCustomerEmailAddress() {
        return CustomerEmailAddress;
    }

    public void setCustomerEmailAddress(String Cemail) {
        this.CustomerEmailAddress = Cemail;
    }
}

public class Customer {
    public static void main(String[] args) {
      VipCustomer Vip = new VipCustomer();
        System.out.println(Vip.getCustomerName());
        System.out.println(Vip.getCustomerCreditLimit());
        System.out.println(Vip.getCustomerEmailAddress());

        System.out.println();

        VipCustomer Vip2 = new VipCustomer("John",600,"Johnny@gmail.com");
        System.out.println(Vip2.getCustomerName());
        System.out.println(Vip2.getCustomerCreditLimit());
        System.out.println(Vip2.getCustomerEmailAddress());
    }
}

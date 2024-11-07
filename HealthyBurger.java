public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthy1Price;

    private String healthyExtra2Name;
    private double healthy2Price;

    public HealthyBurger(String meat,double price){
        super("Healthy",meat,price,"Brown rye");
    }

    public void addHealthAddition(String name,double price){
        this.healthyExtra1Name = name;
        this.healthy1Price = price;
    }
    public void addHealthyAddition2(String name,double price){
        this.healthyExtra2Name = name;
        this.healthy2Price = price;
    }

}

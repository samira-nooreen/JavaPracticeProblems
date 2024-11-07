public class MainBurger {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic","Sausage",3.56,"White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato",0.27);
        hamburger.addHamburgerAddition1("Lettuce",0.75);
        hamburger.addHamburgerAddition1("Cheese",1.13);
        System.out.println("Total burger price is : " +hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.67);
        healthyBurger.addHamburgerAddition1("Egg",5.43);
        healthyBurger.itemizeHamburger();
        healthyBurger.addHamburgerAddition1("Lentils",3.41);

    }
}

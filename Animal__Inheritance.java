public class Animal__Inheritance {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weigth;

    public Animal__Inheritance(String name, int brain, int body, int size, int weigth) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weigth = weigth;
    }

    public void eat1(){
        System.out.println("Animal.eat() called");
    }
    public void move1(int speed){
        System.out.println("Animal.move() called . Animal moving at speed "+speed   );

    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeigth() {
        return weigth;
    }
}

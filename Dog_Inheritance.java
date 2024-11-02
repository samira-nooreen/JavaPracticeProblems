public class Dog_Inheritance extends Animal__Inheritance{

    private int eyes;
    private int legs;
    private int teeth;
    private int tail;
    private String coat;

    public Dog_Inheritance(String name,int size, int weigth,int eyes,int legs,int tail,int teeth,String coat) {
        super(name, 1, 1, size, weigth);
        this.eyes=eyes;
        this.legs=legs;
        this.tail = tail;
        this.teeth=teeth;
        this.coat=coat;
    }
    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat1() {
        System.out.println("Dog.eat() called ");
        chew();
        super.eat1();
    }
    public void walk(){
        System.out.println("Dog.walk() called");
        move1(5);
    }
    public void run(){
        System.out.println("Dog.run() called ");
        move1(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move1(int speed) {
        System.out.println("Dog.move() called ");
        moveLegs(speed);
        super.move1(speed);
    }


}

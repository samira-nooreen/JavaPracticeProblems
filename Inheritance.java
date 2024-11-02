class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        System.out.println("I am setting x now ");
    }

    public void printMe() {
        System.out.println("I am constructor");
    }
}

class Derived extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
        System.out.println("I am setting x now ");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        Derived d= new Derived();
        d.setX(43);
        System.out.println(d.getX());
    }
}

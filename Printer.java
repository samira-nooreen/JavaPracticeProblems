import java.io.Serializable;

public class Printer<T,V> {
    T thingToPrint;
    V otherThing;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print(){
       // thingToPrint.eat();
        System.out.println(thingToPrint);
    }
}

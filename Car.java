public class Car extends Vehical{
    private int door;
    private int engineCapacity;

    public Car(String name, int door, int engineCapacity) {
        super(name);
        this.door = door;
        this.engineCapacity = engineCapacity;
    }
}

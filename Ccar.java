public class Ccar extends Vvehicle{

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Ccar(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void ChangeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): changed to " +this.currentGear+ " gear");
    }

    public void changeVelocity(int speed,int direction){
        System.out.println("Car.changeVelocity() : Velocity " +speed+ "direction " +direction);
        move(speed,direction);

    }
//
//    @Override
//    public void stop() {
//        super.stop();
//    }
}

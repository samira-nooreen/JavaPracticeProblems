
public class Main {
    public static void main(String[] args) {
      Gearbox mcLaren = new Gearbox(6);
      Gearbox.Gear first = mcLaren.new Gear(1,12.3);
      Gearbox.Gear second = mcLaren.new Gear(2,15.4);
      Gearbox.Gear third = mcLaren.new Gear(3,17.8);
        System.out.println(first.driveSpeed(1000));
    }
}
interface Bicycle {
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    void blowHornK3g();
    void BlowHornWW( );
}
class AvonCycle implements Bicycle,HornBicycle{
    void blowHorn(){
        System.out.println("Peee Peee Pooo Poooo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }

    @Override
    public void blowHornK3g() {
        System.out.println("K3g");
    }

    @Override
    public void BlowHornWW() {
        System.out.println("WW");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        AvonCycle avonCycle = new AvonCycle();
        avonCycle.applyBrake(1);
        // You can create properties in Interfaces
        System.out.println(avonCycle.a);

        // You cannot modify the properties in Interfaces as they are final
       // avonCycle.a = 454;
       // System.out.println(avonCycle.a);

        avonCycle.blowHornK3g();
        avonCycle.BlowHornWW();

    }
}

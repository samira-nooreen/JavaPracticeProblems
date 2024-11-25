public class AronCycle implements Bicycle{
    int speed = 7;
    int speedd;


    public void applyBrake(int decrement){
        speedd = speed - decrement;
        System.out.println("After Applying Brake : " +speedd);
    }
    public void speedUp(int increment){
        speed = speed + increment;
        System.out.println("After Speeding up : " +speed);
    }
}

public class Outlander extends Ccar{
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander","4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0){
            stop();
            ChangeGear(1);
        }else if (newVelocity > 0 && newVelocity <= 10){
            ChangeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            ChangeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            ChangeGear(3);
        }else {
            ChangeGear(4);

            if (newVelocity > 0){
                changeVelocity(newVelocity,getCurrentVelocity());
            }
        }
    }
}

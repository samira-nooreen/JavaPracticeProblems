public class FeetAndInchesToCentimeter {
    public static void main(String[] args) {
        calcFeetInchesToCentimeter(100);
        calcFeetInchesToCentimeter(-10);
    }


    public static double calcFeetAndInchesToCentimeter(double feet, double inches) {
        if (feet >= 0 || inches >= 0 && inches <= 12) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        System.out.println(feet + " feet" + inches + " inches" + centimeters + " cm");
        return centimeters;
    }

        public static int calcFeetInchesToCentimeter ( double inches){
            if (inches < 0) {
                return -1;
            }
            double feet = (int)inches/12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches = " + feet + " feet " + remainingInches + " inches");

            return 0;
        }
    }

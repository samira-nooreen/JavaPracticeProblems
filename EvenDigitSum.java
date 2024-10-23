public class EvenDigitSum {
    public static void main(String[] args) {
     int sum = 0;
     sum = getEvenDigitSum(12345);
        System.out.println("Sum od even " +sum);
    }

    public static int getEvenDigitSum(int number) {
        //Invalid Options
        if (number < 0) {
            return -1;
        }

        //Variables
        int sum = 0;
        int lastDigit = 0;

        //calculations
        while (number > 0) {
            lastDigit = number % 10;

            //check if even number
            if (number % 2 == 0) {
                sum += lastDigit; //  sum + last digit = sum
                number /= 10;
            } else {
                number /= 10;
                continue;
            }
        }

        //output
        return sum;


    }
}

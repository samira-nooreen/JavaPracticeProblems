public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }

    private static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int firstDigit = number;
        int lastDigit = 0;

         lastDigit = number % 10;
        while (number >= 10) {
            number /= 10;
        }

        firstDigit = number;

        return firstDigit+lastDigit;
    }

}

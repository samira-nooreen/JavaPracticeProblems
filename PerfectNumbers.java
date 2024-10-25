public class PerfectNumbers {
    public static void main(String[] args) {
        int number = 6;
        boolean result = isPerfectNumber(number);
        System.out.println(+number+" is a perfect number ? " +result);
    }

    public static boolean isPerfectNumber(int number){
        if (number < 1){
            return false;
        }else {
            int sum = 0;
            for (int i =1 ; i<number ; i++){
                if (number % i == 0){
                   sum += i;
                    return true;
                }
            }
            return sum == number;

        }

    }
}

public class SumOdd {
    public static void main(String[] args) {
        System.out.println("Sum of odd numbers from 1 to 10 : " +sumOdd(1,10));
    }

    public static boolean isOdd(int number){
        if (number > 0 && number% 2 != 0 ){
            return true;
        }else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum =0;
        if (start > 0 && end > 0 && start <= end) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)){
                    System.out.println("This number is " +i);
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }
}

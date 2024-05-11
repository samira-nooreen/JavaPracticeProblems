import java.util.Arrays;
import java.util.Scanner;

public class New {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] numbers = input.split(" ");

//        for (String number : numbers)
            int num1 = Integer.parseInt(numbers[0]);
            int num2 = Integer.parseInt(numbers[1]);
        System.out.println(num1*num2);
    }
}





//        String N = sc.next();
//        String[] numbers = input.split(" ");
////        for(int i=0;i<2;i++) {
////           a[i]= Integer.parseInt(Arrays.toString(N.split(" ")));

/* Write a program that reads an integer from the keyboard (we assume that the number is greater than 0, no need to check).
Then calculates the product of numbers from 1 to the entered integer, and displays the result on the screen.
Input example:
12345
Output example:
120*/
import java.util.Scanner;
public class Q27 {

    public static void main(String[] args) {
        //write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = 1;
        while(x > 0 )
        result *= x % 10;
        x = x / 10;
        }
        System.out.println(result);
}

}

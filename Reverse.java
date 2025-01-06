
import java.util.Scanner;

/* 
Reversed number
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int result = 0;

        while (number > 0) {
            result *= 10;
            result += number % 10;
            number = number / 10;
        }

        System.out.println(result);
    }
}

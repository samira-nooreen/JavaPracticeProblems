/* Write a program that reads an integer from the keyboard (we assume that the number is greater than 0, no need to check).
Then reverses the entered number (0 is only considered at the end of the number), and displays the result on the screen.
Input example:
012345
Output example:
54321
*/
import java.util.Scanner;
public class Q28 {
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

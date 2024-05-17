/* Write a program that reads one integer from the keyboard.
If the number consists of three digits, then you need to display the sum of the digits of the number. If it consists of two — the product of digits, if it's one digit — display the number.
In all other cases, do not output anything.
Input example:
123
Output example:
6 */

import java.util.Scanner;

/* 
How many digits
*/

public class Q23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number / 1000 > 0) {
            // do nothing
        } else if (number / 100 > 0) {
            int number1 = number % 10;
            int number2 = number / 10 % 10;
            int number3 = number / 100 % 10;
            System.out.println(number1 + number2 + number3);
        } else if (number / 10 > 0) {
            int number1 = number % 10;
            int number2 = number / 10 % 10;
            System.out.println(number1 * number2);
        } else {
            System.out.println(number);
        }
    }
}

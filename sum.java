/*Write a program that reads an integer from the keyboard (we assume that the number is greater than 0, no need to check).

Then calculates the sum of numbers from 1 to the entered integer, and displays the result on the screen.

Input example:

123
Output example:

7503 */

/* 
Sum of the first
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int result = 0;

        for (int i = 1; i < number; i++) {
            result += i;
        }

        System.out.println(result);
    }
}

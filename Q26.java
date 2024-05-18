/* Then calculates the sum of numbers from 1 to the entered integer, and displays the result on the screen.
Input example:
123
Output example:
7503
Requirements:
The program must read one integer from the keyboard.
The program must display the sum from 1 to the entered integer.*/

import java.util.Scanner;
public class Q26 {

    public static void main(String[] args) {
        //write your code here
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int result = 0;
        for(int i = 1 ; i< x; i++){
            result += i;
        }
        System.out.println(result);

    }
}

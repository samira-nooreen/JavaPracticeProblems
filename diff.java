/* Write a program that reads two integers from the keyboard.
If the first number is greater, then you need to display their difference, otherwise do nothing.
*/


import java.util.Scanner;

/* 
Greater minus smaller
*/

public class Solution {

    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        if(x > y ){
            System.out.println(x-y);
        }
        
    }
}

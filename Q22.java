/* Write a program that reads two integers from the keyboard. If the first number is greater, then you need to display their difference, otherwise do nothing.
Input example:
12
8
Output example:
4  */

import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        //write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if(x>y){
            System.out.println(x-y);
        }
    }
}

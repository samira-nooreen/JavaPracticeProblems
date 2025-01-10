/* Create sqr and cube methods that take an integer (int) and return its square and cube, respectively.

Methods must be public and static, with an int return type.

Method main is not involved in testing.

Requirements:
The Solution class must have public static sqr(int) method, which returns a square of a number (type int).
The Solution class must have public static cube(int) method, which returns a cube of a number (type int).*/



/* 
Square and cube
*/

public class Solution {
    public static void main(String[] args) {
        int number = 3;
        System.out.printf("%d - %d - %d", number, sqr(number), cube(number));
    }

    //write your code here
    public static int sqr(int number){
        return number*number;
    }
    public static int cube(int number){
        return number*number*number;
    }
}

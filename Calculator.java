/*Create a method named calc, which accepts an integer (int), a character (char) and one more integer (int), and depending on the character, returns the result of the corresponding operation on numbers:

'+' — sum of integers
'-' — integer difference (first minus second)
'*' — product of integers
'/' — integer division (divide the first by the second) */
/* 
Calculator
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(calc(1, '+', 2));
        System.out.println(calc(5, '-', 3));
        System.out.println(calc(2, '*', 3));
        System.out.println(calc(20, '/', 5));
    }
    //write your code here
    public static int calc(int a,char c , int b ){
             if (c == '+') {
            return a + b;
        } else if (c == '-') {
            return a - b;
        } else if (c == '*') {
            return a * b;
        } else if (c == '/') {
            return a / b;
        } else {
            return 0;
        }
}}

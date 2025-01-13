/*Create a method named greeting, which accepts a string (String) and an integer (int), and displays the following phrase on the screen:

Hello. My name is <name>. I am <age>.
The method must be public and static, with a void return type.

Method main is not involved in testing.

Requirements:
Solution class must have a public static greeting(String, int) method, which does not return anything.
greeting(String, int) method must output text according to task conditions. */

*/

/* 
Greeting
*/

public class Solution {
    public static void main(String[] args) {
        String name = "Amigo";
        int age = 10;
        greeting(name, age);
    }
    //write your code here
    public static void greeting(String name, int age) {
        System.out.printf("Hello. My name is %s. I am %d.", name, age);
    }
}


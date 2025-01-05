package en.codegym.task.pro.task00.task0014;

import java.util.Scanner;

/* 
Product of the first
*/

public class Solution {

    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        int result = 1;
        while(number > 0){
        result *= number % 10;
        number = number / 10;
        }
        System.out.println(result);
        
    }
}

/*Write a program that fills the existing array named array with integers read from the keyboard.*/

package en.codegym.task.pro.task00.task0016;

import java.util.Arrays;
import java.util.Scanner;

/* 
Fill the array
*/

public class Solution {
    public static int[] array = new int[10];

    public static void main(String[] args) {
        //write your code here
       
       Scanner scanner = new Scanner(System.in);
       
       for(int i = 0 ; i < array.length ; i++){
           array[i] =scanner.nextInt();
       }
       System.out.println(Arrays.toString(array));
    }
}

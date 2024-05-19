/* Write a program that evenly distributes the elements of the array named array among the array1, array2 and array3 arrays according to the following rule:
0th element in array1, 1st -> array2, 2nd -> array3, 3rd -> array1, etc.
Requirements:
The program must not read anything from the keyboard.
The program must evenly distribute elements of the array array to array1, array2 and array3 arrays.*/

import java.util.Arrays;

public class Q31{

    public static int[] array = new int[]{-10, 20, 30, -40, -50, 60, 70, -80, -90};
    public static int[] array1 = new int[3];
    public static int[] array2 = new int[3];
    public static int[] array3 = new int[3];

    public static void main(String[] args) {
    for(int i = 0, j = 0 ; i<array.length ; i+=3 , j++){
        array1[j] = array[i];
        array2[j]=array[i+1];
        array3[j]=array[i+2];
    }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
    }
}

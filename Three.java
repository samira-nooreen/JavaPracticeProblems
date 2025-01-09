
/* 
Think for three
*/

import java.util.Arrays;

public class Solution {

    public static int[] array = new int[]{-10, 20, 30, -40, -50, 60, 70, -80, -90};
    public static int[] array1 = new int[3];
    public static int[] array2 = new int[3];
    public static int[] array3 = new int[3];

    public static void main(String[] args) {
        //write your code here
                for (int i = 0, j = 0; i < array.length; i += 3, j++) {
                    array1[j] = array[i];
                    array2[j]=array[i+1];
                    array3[j]=array[i+2];
                }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
    }
}

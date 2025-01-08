
/* 
Triple every third
*/

import java.util.Arrays;

public class Solution {

    public static int[] array = new int[]{-10, 20, 30, -40, -50, 60, 70, -80, -90};

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i += 3) {
            array[i] *= 3;
        }

        System.out.println(Arrays.toString(array));
    }
}

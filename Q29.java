/* Write a program that fills the existing array named array with integers read from the keyboard.
Requirements:
The program must read 10 integers from the keyboard.
The program must fill the existing array with integers read from the keyboard.*/
import java.util.Arrays;
import java.util.Scanner;
public class Q29 {
 //   public static int[] array = new int[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));
    }
}

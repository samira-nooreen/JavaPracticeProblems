/* Correct the program so that for the numbers that correspond to the days of the week Saturday and Sunday, the output is true, and for all other cases — false.
Requirements:
The program should not read anything from the keyboard.
The program should display true if the value of the numberDayOfWeek variable is 0 or 6.
The program should display false if the value of the numberDayOfWeek variable is not 0 or 6. */

public class Q24 {
    private static int numberDayOfWeek = 6; // Sunday - 0, Monday - 1, ..., Saturday - 6.

    public static void main(String[] args) {
        boolean isWeekEnd = numberDayOfWeek == 0 || numberDayOfWeek == 6;

        System.out.println(isWeekEnd);
    }
}

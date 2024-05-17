/*   Assign values to condition1, condition2 and condition3 variables so that for the numbers that correspond to the winter months, true is displayed, and false in other cases.
Requirements:
The program should not read anything from the keyboard.
The program should display true if the numberOfMonth variable's value is 12, 1, or 2.
The program should display false if the numberOfMonth variable's value is not 12, 1, or 2. */
public class Q25 {
    private static int numberOfMonth = 12; // January - 1, February - 2, ..., December - 12

    public static void main(String[] args) {
        boolean condition1 = numberOfMonth >= 1; 
        boolean condition2 = numberOfMonth <= 2;
        boolean condition3 = numberOfMonth == 12;
        boolean isWinter = (condition1 && condition2) || condition3;
        System.out.println(isWinter);
    }
}

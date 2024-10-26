import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean hasValidInput = false;  // Track if at least one valid input was given

        while (true) {
            System.out.println("Enter a number (or any non-integer to quit): ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                hasValidInput = true;  // We have at least one valid input

                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine(); // Handle the "Enter" key
        }

        if (hasValidInput) {
            System.out.println("min = " + min + ", max = " + max);
        } else {
            System.out.println("No valid input was entered.");
        }

        scanner.close();
    }
}


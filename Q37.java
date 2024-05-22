/*Write a Java program that converts a string representation of a number to its corresponding data type.
Your program should support conversion to three data types: integer, float, and boolean.
Implement the following methods:
convertToInteger(String input): This method takes a string input and returns the corresponding integer value.
If the input cannot be converted to an integer, return 0.
convertToFloat(String input): This method takes a string input and returns the corresponding float value.
If the input cannot be converted to a float, return 0.0.
convertToBoolean(String input): This method takes a string input and returns the corresponding boolean value.
If the input is "true" (case-insensitive), return true; otherwise, return false.
Requirements:
•	Implement the convertToInteger() method according to the requirements.
•	Implement the convertToFloat() method according to the requirements.
•	Implement the convertToBoolean() method according to the requirements.*/

import java.util.Scanner;

public class Q37 {

    public static int convertToInteger(String input) {
        //write your code here
        try{
             return Integer.parseInt(input);
        }catch(NumberFormatException e){
        return 0;
    }}

    public static float convertToFloat(String input) {
        //write your code here
        try{
            return Float.parseFloat(input);
        }catch(NumberFormatException e){
        return 0.0f;
        }
    }

    public static boolean convertToBoolean(String input) {
        //write your code here
            return Boolean.parseBoolean(input);
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string value: ");
        String value = scanner.nextLine();

        System.out.print("Select data type for conversion (integer, float, boolean): ");
        String dataType = scanner.nextLine();

        switch (dataType.toLowerCase()) {
            case "integer":
                int intValue = convertToInteger(value);
                System.out.println("Converted value: " + intValue);
                break;
            case "float":
                float floatValue = convertToFloat(value);
                System.out.println("Converted value: " + floatValue);
                break;
            case "boolean":
                boolean boolValue = convertToBoolean(value);
                System.out.println("Converted value: " + boolValue);
                break;
            default:
                System.out.println("Invalid data type selected.");
        }

        scanner.close();
    }
}

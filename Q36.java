/*Add one type conversion in the code to get the following output on the screen:
7
Requirements:
•	The program should display text on the screen.
•	Don't change the screen output command. You can only add cast operators to it.
•	The main() method must contain a short variable called number.
•	The main() method must contain a char variable called zero.
•	The main() method must contain an int variable called seven.
•	Don't change the initial value of the variables during initialization. You can only add cast operators.
. The program should display the number 7.*/

public class Q36 {
    public static void main(String[] args) {
        short number = 7;
        char zero = '0';
        int seven = (zero + number);
        System.out.println(char(seven));
    }
}

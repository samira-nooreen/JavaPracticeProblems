/* n computing, End Of File (commonly abbreviated EOF) is a condition in a computer operating system where no more data can be read from a data source." — (Wikipedia: End-of-file)

The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.

Hint: Java's Scanner.hasNext() method is helpful for this problem.

Input Format

Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space, and then the line content received as input.

Sample Input

Hello world
I am a file
Read me until end-of-file.
Sample Output

1 Hello world
2 I am a file
3 Read me until end-of-file.*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Create a Scanner object to read input from standard input (keyboard)
        Scanner sc = new Scanner(System.in);
        
        // Line number starts from 1
        int lineNumber = 1;
        
        // Read input line by line until EOF
        while (sc.hasNextLine()) {
            // Read the next line
            String line = sc.nextLine();
            
            // Print the line number and the line content
            System.out.println(lineNumber + " " + line);
            
            // Increment the line number for the next iteration
            lineNumber++;
        }
        
        // Close the scanner
        sc.close();
    }
}


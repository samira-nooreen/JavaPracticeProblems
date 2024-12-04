/* Grades of Student
Write a program to print the grades of 3 students based on the marks they have obtained provided as input. The student is graded A if marks are greater than 90, B if marks are greater than 70, C if greater than or equal to 40, else F.
[Note: You need to take inputs for all 3 students.]

Sample 1:
Input:    Output:
95          A
40          C
20          F */

import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		// 1st input
		Scanner scanner = new Scanner(System.in);
		int marks = scanner.nextInt();
		
		if (marks > 90 ){
		    System.out.println("A");
		} else if(marks > 70 ){
		    System.out.println("B");
		}else if (marks >= 40 ){
		    System.out.println("C");
		} else{
		    System.out.println("F");
		}
		
		// 2nd input
		 marks = scanner.nextInt();
		
		if (marks > 90 ){
		    System.out.println("A");
		} else if(marks > 70 ){
		    System.out.println("B");
		}else if (marks >= 40 ){
		    System.out.println("C");
		} else{
		    System.out.println("F");
		}
		
		// 3rd input
		
		 marks = scanner.nextInt();
		
		if (marks > 90 ){
		    System.out.println("A");
		} else if(marks > 70 ){
		    System.out.println("B");
		}else if (marks >= 40 ){
		    System.out.println("C");
		} else{
		    System.out.println("F");
		}

	}
}

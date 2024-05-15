/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Q12
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);

        String arr[]= new String[3];
        arr=br.readLine().split(" ");
        int N=Integer.parseInt(arr[0]);
        int A=Integer.parseInt(arr[1]);
        int B=Integer.parseInt(arr[2]);

        System.out.println((N-A)+" "+((N-A)-B));
    }
}
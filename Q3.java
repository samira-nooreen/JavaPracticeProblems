import java.util.*;
import java.lang.*;
import java.io.*;
class Q3
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        // write your code here
        if(x >= 2*y){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

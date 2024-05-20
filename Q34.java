/* Create a method named calc, which accepts an integer (int), a character (char) and one more integer (int), and depending on the character, returns the result of the corresponding operation on numbers:
'+' — sum of integers
'-' — integer difference (first minus second)
'*' — product of integers
'/' — integer division (divide the first by the second)
If the passed character does not match those listed above, then the method should return 0.
The calc method must be public and static, with a void return type.
Method main is not involved in testing.
Requirements:
Solution class must have a public static calc(int, char, int) method, which returns an int.
calc(int, char, int) method must return a result according to task conditions.
*/

public class Q34 {
    public static void main(String[] args) {
        System.out.println(calc(1, '+', 2));
        System.out.println(calc(5, '-', 3));
        System.out.println(calc(2, '*', 3));
        System.out.println(calc(20, '/', 5));
    }
    //write your code here
    public static int calc(int n1,char c,int n2){
        if(c == '+'){
            return n1+n2;
        }else if(c == '-'){
            return n1-n2;
        }else if(c == '*'){
            return n1*n2;
        }else if(c == '/'){
            return n1/n2;
        }else{
            return 0;
        }
    }
  

class Geeks{
       public static void dataTypes(int a, float b, double c, long l, byte d){
        
        double p = c/b ;//
        double q = b/a;//
        double r = c/a ;//
        double m = r+l ;//
        int s = a/d ;//
  
        System.out.println(p + " " + q + " " + r + " " + m + " " + s);
        
    }
}

//Working with Data Types is very important in the programming world. Here, we will learn to manipulate the basic data types in Java. You will be given four different variables of different data types: a (int), b (float), c (double), l (long), d (byte). Your task is to do step-wise operations as given below:
// 1. Divide c by b.
//2. Divide b by a.
//3. Divide c by a.
//4. Add the result at step 3 with l.
//5. Divide a by d.
/*
Example 1:

Input:
1 2 3 5 127
Output:
1.5 2.0 3.0 8.0 0
Exaplanation:
a=1, b=2, c=3, l=5, d=127
c/b=1.5
b/a=2.0
c/a=3.0
(c/a)+l=8.0
a/d=0
*/

/*You are tasked with creating a simple calculator application that performs basic arithmetic operations.
The calculator should have separate static classes for addition, subtraction, multiplication, and division operations.
Requirements:
In the Calculator class, there should be four static classes declared: Addition, Subtraction, Multiplication, and Division.
All static classes should have a public static int calculate(int, int) method.
The calculate method in the Addition class should add two numbers and return the sum.
The calculate method in the Subtraction class should subtract the second number from the first and return the difference.
The calculate method in the Multiplication class should multiply two numbers and return the product.
The calculate method in the Division class should divide the first number by the second and return the quotient.
If the second argument passed to the calculate method in the Division class is 0, the method should return 0.*/
public class Calculator {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

       int sum = Addition.calculate(num1, num2);
       System.out.println("Sum: " + sum);

       int difference = Subtraction.calculate(num1, num2);
        System.out.println("Difference: " + difference);

        int product = Multiplication.calculate(num1, num2);
       System.out.println("Product: " + product);

       int quotient = Division.calculate(num1, num2);
       System.out.println("Quotient: " + quotient);
    }

    //write your code here
    public static class Addition{
    public static int calculate(int num1,int num2){
        return num1+num2;
    }
    }
        public static class Subtraction{
    public static int calculate(int num1,int num2){
        return num1-num2;
    }
    }
        public static class Multiplication{
    public static int calculate(int num1,int num2){
      return num1*num2;
    }
    }
        public static class Division{
    public static int calculate(int num1,int num2){
       if(num2 != 0)
       return num1/num2;
    else{
        return 0;
    }
    }
}
}

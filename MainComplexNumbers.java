public class MainComplexNumbers {
    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0,1.0);
        ComplexNumber number = new ComplexNumber(2.5,-1.5);

        one.Add(1,1);
        System.out.println("One real = "+one.getReal());
        System.out.println("One imaginary = "+one.getImaginary());

        one.Sub(number);
        System.out.println("One real = "+one.getReal());
        System.out.println("One imaginary = "+one.getImaginary());

        number.Sub(one);
        System.out.println("Number real = "+number.getReal());
        System.out.println("Number Imaginary = "+number.getImaginary());
    }
}

public class MainSC {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.8);
        calculator.setSecondNumber(4);
        System.out.println("Addition = "+calculator.getAdditionResult());
        System.out.println("Subtraction = "+calculator.getSubtractionResult());
        System.out.println("Multiplication = "+calculator.getMultiplicationResult());
        System.out.println("Division = "+calculator.getDivisionResult());
    }



}

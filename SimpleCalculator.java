public class SimpleCalculator {
  private double firstNumber;
  private double secondNumber;




    //Getters
    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }

    public double getAdditionResult(){
        return getFirstNumber() + getSecondNumber();
    }
    public double getSubtractionResult(){
        return getFirstNumber()-getSecondNumber();
    }
    public double getMultiplicationResult(){
        return getFirstNumber()*getSecondNumber();
    }
    public double getDivisionResult(){
        // can't divide 0
        if (secondNumber == 0 || firstNumber == 0){
            return 0;
        }
        return getSecondNumber() / getFirstNumber();
    }


    //Settlers

    public void setFirstNumber(double firstNumber){
        this.firstNumber=firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber=secondNumber;
    }

}

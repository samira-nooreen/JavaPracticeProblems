import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Double;

class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class New {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Tim");

        ArrayList<IntClass>IntClassArrayList = new ArrayList<>();
        IntClassArrayList.add(new IntClass(54));
        Integer integer = new Integer(54);
        Double doubleValue = new Double(1225);

        ArrayList<Integer>integerArrayList = new ArrayList<Integer>();
//        for (int i = 0; i <= 10 ;i++){
//            integerArrayList.add(Integer.valueOf(i));
//        }
//        for (int i = 0 ; i<= 10 ;i ++){
//            System.out.println(i + "----->" +integerArrayList.get(i).intValue());

            Integer myIntValue = 56;
            int myInt = myIntValue.intValue();

            ArrayList<Double>myDoubleValue = new ArrayList<Double>();
            for (double dbl = 0.0 ; dbl<=10 ; dbl+=0.5){
                myDoubleValue.add(Double.valueOf(dbl));
            }
            for (int i = 0 ; i<myDoubleValue.size() ;i++){
                double value = myDoubleValue.get(i).doubleValue();
                System.out.println(i +"--->"+value);

            }
        }
    }


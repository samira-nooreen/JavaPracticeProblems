import java.util.Arrays;

public class ReferenceType {
    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherValue = myIntValue;

        System.out.println("myIntValue = " +myIntValue);
        System.out.println("anotherValue = "+anotherValue);

        anotherValue++;

        System.out.println("myIntValue = " +myIntValue);
        System.out.println("anotherValue = "+anotherValue);

        int[] myIntArray = new int[5];
        int[] anotherArray =myIntArray;

        System.out.println("myIntArrays = "+ Arrays.toString(myIntArray));
        System.out.println("myIntArrays = "+ Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("After change myIntArrays = "+ Arrays.toString(myIntArray));
        System.out.println("After change myIntArrays = "+ Arrays.toString(anotherArray));

        anotherArray = new int[]{4,5,6,7,8};
        modifyArray(myIntArray);

        System.out.println("After modify myIntArrays = "+ Arrays.toString(myIntArray));
        System.out.println("After modify myIntArrays = "+ Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {

        array[0] =2;
        array = new int[] {1,2,3,4,5};

    }
}

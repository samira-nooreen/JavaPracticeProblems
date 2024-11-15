import org.w3c.dom.Node;

import java.util.LinkedList;

public class Problem {
    public static void main(String[] args) {
        LinkedList<Integer> number = new LinkedList<>();
        number.addFirst(1);
        number.addFirst(5);
        number.addFirst(7);
        number.addFirst(3);
        number.addFirst(8);
        number.addFirst(2);
        number.addFirst(3);

        System.out.println(number);

        int searchKey = 7;
        if (number.contains(searchKey)){
            int index = number.indexOf(searchKey);
            System.out.println("Element " +searchKey+ " index  " +index);
        }else{
            System.out.println("Not found");
        }
    }
}

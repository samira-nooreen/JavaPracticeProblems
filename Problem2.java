import java.util.LinkedList;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        LinkedList<Integer>n = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number between 1 to 50 (Enter -1 to stop)");
        while (true){
            int input = scanner.nextInt();
            if (input == -1 ){
                break;
            }if (input >= 1 && input <= 50){
                n.add(input);
            }else {
                System.out.println("please enter a number between 1 and 50");
            }
        }
        System.out.println("Original linked list: "+n);


        n.removeIf(num -> num > 25);

        System.out.println("Greater than 25 : " +n);
    }
}

/*The main method displays the values of six strings.

Modify the code so that it displays the length of each string instead of the value of each string.

Requirements:
Do not change the value of the emptyString variable.
You need to call the length() method on the six strings passed to the println() method.
The program must display six numbers, each on a new line. */

public class Q38 {

    public static void main(String[] args) {
        String emptyString = "";

        //write your code here
        
        System.out.println(emptyString.length());
        System.out.println("Gomu Gomu no Bazooka!".length());
        System.out.println((emptyString + 2 + 2 + "22").length());
        System.out.println("of Edo's rain".length());
        System.out.println("how many mouthfuls did you drink,".length());
        System.out.println("cuckoo?".length());
    }
}

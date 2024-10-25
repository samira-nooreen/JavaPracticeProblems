public class NumberPalidrone {
    public static void main(String[] args) {
        boolean n = Palidrone(121);
        System.out.println(n);

    }
    public static boolean Palidrone(int number){
        if (number < 0){
            return false;
        }else {
            int temp = number; // temp = 121
            int rev =0;

            while (number > 0){           // 121>0                        //12>0                      // 1
                int digit = number%10;    // digit = 121%10=1             // digit = 12%10=2          //digit = 1%10=1
                rev = (rev*10)+digit;     // 0 = 0 + 1 = 1                // 1=(1*10)+2=12            // 12=(12*10)+1=121
                number/= 10;              // 121/10 = 12                  // 12/10 = 1                // 1/10=0
            }
          return rev == temp;

        }
    }
}

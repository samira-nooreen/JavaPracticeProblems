public class AllFactors {
    public static void main(String[] args) {
     printFactors(6);
    }

    public static void printFactors(int number){
        if (number < 1){
            System.out.println("Invalid Value");
            return;
        }else {
            for (int i = 1 ; i<=number ;i++){
                if (number % i == 0){
                }
                System.out.println("Factors of " +number+" = " +i);

            }
        }
    }
}

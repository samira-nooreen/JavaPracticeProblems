
public class Main {
    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1){
//            System.out.println("Value was 1");
//        } else if (value == 2){
//            System.out.println("Value was 2");
//        }else {
//            System.out.println("Was not 1 or 2");
//        }


        int switchValue = 6;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3 or a 4 or a 5 ");
                System.out.println("Actually it was a "+switchValue);
                break;
            default:
                System.out.println("Was not 1,2,3,4 or 5");
                break;
        }


        char newSwitchValue = 'Z';

        switch (newSwitchValue){
            case 'A':
                System.out.println("Found A ");
                break;
            case 'B':
                System.out.println("Found B ");
                break;
            case 'C':
                System.out.println("Found C ");
                break;
            case 'D':
                System.out.println("Found D ");
                break;
            case 'E':
                System.out.println("Found E ");
                break;
            default:
                System.out.println("Not Found " +newSwitchValue);
                break;
        }

        String month = "January";
        switch (month){
            case "January":
                System.out.println("Jan");
                break;
            case "February":
                System.out.println("Feb");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
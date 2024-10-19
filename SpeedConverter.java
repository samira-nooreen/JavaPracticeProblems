public class SpeedConverter {

    public static long toMilesPerHour(double KilometersPerHour){
        if (KilometersPerHour < 0 ) {
            return -1;
        }
        return Math.round(KilometersPerHour/1.609);
    }

    public static void printConversion(double KilomertersPerHour){
        if (KilomertersPerHour < 0 ){
            System.out.println("Invalid Value");
        }else {
            long milesPerHour = toMilesPerHour(KilomertersPerHour);
            System.out.println(KilomertersPerHour  +
                    " Km/h = " + milesPerHour +
                    " mi/h");
        }
    }
}

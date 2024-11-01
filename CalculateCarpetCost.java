public class CalculateCarpetCost {
    private Floor floor;
    private Carpet carpet;

    public CalculateCarpetCost(Floor f,Carpet c){
        this.floor = f;
        this.carpet = c;
    }

    public double getTotal(){
        return floor.getArea() * carpet.getCost();
    }

    public static void main(String[] args) {
        Carpet carpet1 = new Carpet(3.5);
        Floor floor1 = new Floor(2.75,4.0);
        CalculateCarpetCost calculateCarpetCost = new CalculateCarpetCost(floor1,carpet1);
        System.out.println("Total = " + calculateCarpetCost.getTotal());

        System.out.println();

        carpet1 = new Carpet(1.5);
        floor1 = new Floor(5.4,4.5);
        calculateCarpetCost = new CalculateCarpetCost(floor1,carpet1);
        System.out.println("Total = "+calculateCarpetCost.getTotal());
    }
}

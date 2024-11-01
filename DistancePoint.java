class Point{
    private int x;
    private int y;


    public Point(){
        this(4,2);
    }
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

   public double getDistance(){
        return Math.sqrt((x*x)+(y*y));
   }
   public double getDistance(int x,int y){
        return Math.sqrt(Math.pow(this.x - x , 2) + (Math.pow(this.y - y , 2 )));
   }
   public double distance(){
        return getDistance();
   }
}

public class DistancePoint {
    public static void main(String[] args) {
Point p = new Point(6,5);
        System.out.println("Distance(0,0) = "+p.getDistance());

        Point anotherPoint = new Point();
        System.out.println(p.getDistance(anotherPoint.getX(),anotherPoint.getY()));
    }
}

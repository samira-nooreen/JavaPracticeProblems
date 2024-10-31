class Wall{
    private double width;
    private double height;
    private double area ;

    public Wall(){
        width = 2;
        height = 2;
        area = height * width;
    }
    public Wall(double w,double h){
        width = w;
        height = h;
        area = height * width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            this.width = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0 ) {
            this.height = 0;
        }
    }


    public double getArea() {
        return height*width;
    }

    public void setArea(double area) {
        this.area = height*width;
    }
}

public class WallArea {
    public static void main(String[] args) {
   Wall w = new Wall(5,4);
        System.out.println("Area   = " + w.getArea());

        Wall w2 = new Wall(5,4);
       w.setHeight(-1.2);
        System.out.println("Width  = " + w.getWidth());
        System.out.println("Height = " + w.getHeight());
        System.out.println("Area   = " + w.getArea());

    }
}

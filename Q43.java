/*Add two public static methods to the Sheep class: int getSheepCount() and setSheepCount(int), which you can use to get/change the number of sheep (variable sheepCount).

Requirements:
The Sheep class must contain a getSheepCount method.
The getSheepCount method must return an int.
The getSheepCount method must return the value of the variable sheepCount.
The Sheep class must contain a setSheepCount method that takes an int as the parameter.
The setSheepCount method should not return anything.
The setSheepCount method must set the variable sheepCount to the passed value.*/

public class Sheep {
    private static int sheepCount = 0;

    public static int getSheepCount() {
        return sheepCount;
    }

    public static void setSheepCount(int sheepCount) {
        Sheep.sheepCount = sheepCount;
    }

    public static void main(String[] args) {

    }
}

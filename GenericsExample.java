import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsExample {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
       // printList(intList);


        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        printList(catList);

      //  shout("Jhon",76);


//        Printer<Cat> printer = new Printer<>(new Cat());
//        printer.print();
//
//        Printer<Dog> printer1 = new Printer<>(new Dog());
//        printer1.print();
//
////        Printer<String>printer2 = new Printer<>("Heyy");
////        printer2.print();
//
//        ArrayList<Cat>cats = new ArrayList<>();
//        cats.add(new Cat());
//      //  cats.add(new Dog());
//
//        Cat myCat = (Cat)  cats.get(0);
    }


//    private static <T,V> T shout(T thingToShout,V otherThingShout){
//        System.out.println(thingToShout + "!!!!!!1");
//        System.out.println(otherThingShout + "!!!!!!");
//
//        return thingToShout;
//    }




    private static void printList(List<? extends  Animal> myList){
        System.out.println();
    }
}

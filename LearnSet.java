import java.util.HashSet;
import java.util.Set;

public class LearnSet {

//HashSet , LinkedHashSet , TreeSet same

public static void main(String[] args) {

    Set<Integer> set = new HashSet<>();

    set.add(32);
    set.add(54);
    set.add(2);
    set.add(3);
    set.add(65);

    System.out.println(set);

    set.remove(54);

    System.out.println(set);

    System.out.println(set.contains(2));

    System.out.println(set.isEmpty());
    System.out.println(set.size());

    set.clear();
    System.out.println(set);


}




}

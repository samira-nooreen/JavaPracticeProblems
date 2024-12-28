import java.util.HashSet;
import java.util.Set;

public class LearnHashSetStudent {
    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Anuj" ,2));
        studentSet.add(new Student("Ramesh",4));
        studentSet.add(new Student("Shivam" , 3));
        studentSet.add(new Student("Rohit",2));

        Student s1 = new Student("Anuj",2);
        Student s2 = new Student("Rohit",2);

        System.out.println(s1.equals(s2));

        System.out.println(studentSet);
    }
}

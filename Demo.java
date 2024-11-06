 class Human {

    private int age;
    private String name;

    public void setAge(int a) {
        this.age = a;
    }

    public int getAge() {
        return age;
    }

    public void setName(String n) {
        this.name = n;
    }

     public String getName() {
         return name;
     }
 }
public class Demo {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(20);
        obj.setName("Sammu");

        System.out.println(
                "Age = " +obj.getAge() +" Name = " +obj.getName());
    }
}

class Person{
    private int age;
    private String firstName;
    private String lastName;


    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String fN){
        this.firstName=fN;
    }


    public String getLastName(){
        return lastName;
    }
    public void  setLastName(String lN){
        this.lastName=lN;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age < 0 || age > 100) {
            age = 0;
        }
        this.age=age;
    }

    public boolean isTeen(){
        if (getAge() > 12 && getAge() < 20){
            return true;
        }
        return false;
    }

    public String getFulltName(){
        if (firstName.isEmpty() && lastName.isEmpty()){
            return " ";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()){
            return firstName;
        }else {
            return getFirstName() + " " +getLastName();
        }
    }
}


public class PersonIsTeen {
    public static void main(String[] args) {
      Person person = new Person();
      person.setFirstName("Samira");
      person.setLastName("Nooreen");
      person.setAge(20);

        System.out.println("Full Name = " +person.getFulltName());
        System.out.println("Teen = " +person.isTeen());
    }
}

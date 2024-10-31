class MyMainEmployee {
    private int id;
    private String name;
    private int salary;

    public MyMainEmployee() {
        id = 0;
        name = "Your-Name";
        salary = 1000;
    }

    public MyMainEmployee(String myName, int myId,int mySalary) {
        id = myId;
        name = myName;
        salary = mySalary;
    }
    public MyMainEmployee(String myName) {
        id = 14;
        name = myName;
        salary = 12000;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
    public void setSalary(int s){
        this.salary = s;
    }
    public int getSalary(){
        return salary;
    }
}


public class Constructors {
    public static void main(String[] args) {
//MyMainEmployee harry = new MyMainEmployee("CodeWithHarry",14);
        MyMainEmployee harry = new MyMainEmployee("samm");
        System.out.println(harry.getName());
        System.out.println(harry.getId());
        System.out.println(harry.getSalary());

        System.out.println();

        MyMainEmployee harry1 = new MyMainEmployee("Harry",1,8900);
        System.out.println(harry1.getName());
        System.out.println(harry1.getId());
        System.out.println(harry1.getSalary());
    }
}

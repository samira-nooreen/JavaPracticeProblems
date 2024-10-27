class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
      this.name = n;
    }
    public int gettId(){
        return id;
    }
    public void setId(int i){
        this.id = i;
    }
}


public class gettersSetters {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
//        harry.id = 45;
//        harry.name = "CodeWithHarry";

        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());

        harry.setId(14);
        System.out.println(harry.gettId());
    }
}


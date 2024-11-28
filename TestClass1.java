public class TestClass1 {
    private int id = 101;

    public static void main(String[] args) {
        System.out.println("In main method : TestClass1");
        TestClass1 tc1 = new TestClass1();
        TestClass4 tc4 = new TestClass1().new TestClass4();
        tc4.show();
    }

    public class TestClass4{
    public TestClass4() {
    }

    public void show() {
        System.out.println(id);
    }
    public void add(){
        TestClass4 tc4 = new TestClass4();
    }
    }
}

public class TestClass1 {
    private int id = 101;

    public static void main(String[] args) {
        System.out.println("In main method : TestClass1");
       // TestClass1 tc1 = new TestClass1();
        TestClass4 tc4 = new TestClass1().new TestClass4();
        System.out.println(tc4.getEmployeeID());
        tc4.calculateSalary();
        tc4.show();
        // tc4.sub();
    }


    public class TestClass4 implements Employee{
        private int id = 102;
        public void show(){

        }

        @Override
        public int getEmployeeID() {
            return id;
        }

        @Override
        public void calculateSalary() {
            System.out.println("Salary is 1lakh");
        }
    }

//
//    public class TestClass4 extends Student{
//        private int id = 102;
//        public void show(){
//            int id = 103;
//            System.out.println(id);
//            System.out.println(this.id);
//            System.out.println(TestClass1.this.id);
//            System.out.println(getMarks());
//            giveExam();
//        }
//        @Override
//        public int getMarks(){
//            return 666;
//        }
//
//        public void giveExam(){
//            System.out.println("Exam given");
////    public TestClass4() {
////    }
////
////    public void show() {
////        System.out.println(id);
////    }
////    public void add(){
////        TestClass4 tc4 = new TestClass4();
////    }
////    }
////    public class TestClass5{
////        public void sub(){
////           TestClass4 tc4 = new TestClass1().new TestClass4();
////           tc4.show();
////        }
//    }
//
//    }

}

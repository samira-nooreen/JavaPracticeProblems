public class C implements A,B{
    int c;
    public void show(){
        c = A.a + B.a;
        System.out.println("A.a = " + A.a);
        System.out.println("B.b = " + B.a);
        System.out.println("C = " +c);

    }

}

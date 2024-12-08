import java.util.ArrayList;


class MyGenerics<T1,T2>{
    int val = 344;
    private T1 t1;
    private T2 t2;

    public MyGenerics(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }


    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}
class Generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
       // arrayList.add("Str1");
        arrayList.add(54);
        arrayList.add(643);


        int a =(int) arrayList.get(0);
//        System.out.println(a);


        MyGenerics<String,Integer>g1 = new MyGenerics(23,"MyString is my Sring ", 78);
        String str = g1.getT1();
        Integer str2 = g1.getT2();
        System.out.println(str + str2);
    }
}
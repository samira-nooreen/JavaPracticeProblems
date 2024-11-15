public class Basicsll {

    public static class Node{
        int data; // value
        Node next; //address of next node
        Node(int data){
            this.data=data;
        }


    }
    public static void main(String[] args) {
        Node a = new Node(5);
//        System.out.println(a.next); // null
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e =new Node(16);

        //5->3->9->8->16
//        a.next = b;
//        System.out.println(a);        // Basicsll$Node@5f184fc6
//        System.out.println(a.next);   //Basicsll$Node@5f184fc6
//        System.out.println(b);        // Basicsll$Node@3feba861
//        System.out.println(c);        //Basicsll$Node@5b480cf9
//
        a.next = b; // 5->3 9 8 16
        b.next = c; // 5->3->9 8 16
        c.next = d;// 5->3->9->8 16
        d.next = e;// 5->3->9->8->16

        Node temp = a;
        for (int i = 1; i <= 5 ; i++){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }




    }
}

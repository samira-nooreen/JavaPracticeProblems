public class Basicsll {

    public static  void Displayr(Node head) {
        if (head == null) return;
        System.out.print(head.data);
        Displayr(head.next);
    }

    public static  void Displayreverse(Node head) {
        if (head == null) return;
        Displayr(head.next);
        System.out.print(head.data);
    }

    public static void Display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static int length(Node head){
        int count = 0 ;
        while (head != null){
            count++;
            head = head.next;
        }
        return count;
    }

    public static class Node {
        int data; // value
        Node next; //address of next node

        Node(int data) {
            this.data = data;
        }


    }

    public static void main(String[] args) {
        Node a = new Node(5);
//        System.out.println(a.next); // null
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(100);

        a.next = b; // 5->3 9 8 16
        b.next = c; // 5->3->9 8 16
        c.next = d;// 5->3->9->8 16
        d.next = e;
//        Display(a);
//        System.out.println();
//        Displayr(a);
        System.out.println(length(a));

    }
}

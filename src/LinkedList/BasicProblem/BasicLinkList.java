package LinkedList.BasicProblem;

public class BasicLinkList {
    public static void main(String[] args) {

        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println("Trick 1");
        System.out.print(a.data +"->");
        System.out.print(b.data +"->");
        System.out.print(c.data +"->");
        System.out.print(d.data +"->");
        System.out.println(e.data );

        System.out.println("Trick 2");
        System.out.print(a.data +"->");
        System.out.print(a.next.data +"->");
        System.out.print(a.next.next.data +"->");
        System.out.print(a.next.next.next.data +"->");
        System.out.print(d.next.data );

    }
}

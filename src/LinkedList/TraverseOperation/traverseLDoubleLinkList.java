package LinkedList.TraverseOperation;


public class traverseLDoubleLinkList {



    public static class Node {
        int data;
        Node next;
        Node prev;


        public Node(int data) {
            this.data = data;
        }
    }


    public static Node head;
    public static Node tail;


    // Insert First
    public static void insertFirst(int data) {


        Node newNode = new Node(data);


        if (head == null) {
            head = tail = newNode;
            return;
        }


        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }


    // Insert Last
    public static void insertLast(int data) {


        Node newNode = new Node(data);


        if (head == null) {
            head = tail = newNode;
            return;
        }


        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }











    // Insert Middle
    public static void insertMid(int data, int pos) {


        if (pos <= 1) {
            insertFirst(data);
            return;
        }


        Node temp = head;


        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }


        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }


        if (temp == tail) {
            insertLast(data);
            return;
        }


        Node newNode = new Node(data);


        newNode.next = temp.next;
        newNode.prev = temp;


        temp.next.prev = newNode;
        temp.next = newNode;
    }


    // Delete First
    public static void deleteFirst() {


        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }


        if (head == tail) {
            head = tail = null;
            return;
        }


        head = head.next;
        head.prev = null;
    }

















    // Delete Last
    public static void deleteLast() {


        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }


        if (head == tail) {
            head = tail = null;
            return;
        }


        tail = tail.prev;
        tail.next = null;
    }


    // Display
    public static void display() {


        Node temp = head;


        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }


        System.out.println("null");
    }


    // Display Reverse
    public static void displayReverse() {


        Node temp = tail;


        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }


        System.out.println("null");
    }













    public static void main(String[] args) {


        insertFirst(20);
        insertFirst(10);


        insertLast(30);
        insertLast(40);
        insertLast(50);


        System.out.println("Original List:");
        display();


        deleteFirst();


        System.out.println("After Delete First:");
        display();


        deleteLast();


        System.out.println("After Delete Last:");
        display();


        System.out.println("Reverse Display:");
        displayReverse();
    }
}

package LinkedList.TraverseOperation;

public class traverseLinkList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
       public static Node head;
       public static Node tail;
        public static void  insertAtEnd(int value)
        {
            Node temp = new Node(value);
            if(head==null){
                head = temp;
                tail=temp;
            }else{
                tail.next =temp;
                tail= temp;
            }
        }
        public static void  insertAtStart(int value)
        {
            Node temp = new Node(value);
            if(head==null){
                head = temp;
                tail=temp;
            }else{
                temp.next =head;
                head= temp;
            }
        }
        public static void display()
        {
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ->");
                temp = temp.next;
            }
        }
        public static int count()
        {
            int count =0;
            Node temp = head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
    public static int findMid()
    {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }
        public static int search(int value) {
            Node temp = head;
            int index = 0;


            while (temp != null) {


                if (temp.data == value) {
                    return index;
                }


                temp = temp.next;
                index++;
            }


            return -1;
        }

        public static void main(String[] args) {
            insertAtEnd(5);
            insertAtEnd(6);
            insertAtStart(9);
            display();
            System.out.println(" ");
            System.out.println("Number of Nodes " +count());
            System.out.println(findMid());

        }

}

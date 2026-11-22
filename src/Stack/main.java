package Stack;

public class main {
    public static void main(String[] args) {
        StacksOps st =new StacksOps();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
       st.display();
        System.out.println();
       st.pop();
        System.out.println("After poping:");
       st.display();
        System.out.println();
        System.out.println("Peek element:");
        System.out.println(st.peek());
    }
}

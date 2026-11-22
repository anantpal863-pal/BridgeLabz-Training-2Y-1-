package Stack;

import java.util.Stack;

public class SimpleDecreasingStack{
    public static void main(String[] args) {
        int num[] = {12,5,6,9};
        Stack<Integer> st = new Stack<>();
        for(int n :num){
            while(!st.isEmpty()&&st.peek()<n)
            {
                st.pop();
            }
            st.push(n);
        }
        System.out.println(st);
    }

}
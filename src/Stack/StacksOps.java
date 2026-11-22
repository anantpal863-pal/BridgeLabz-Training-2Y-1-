package Stack;

public class StacksOps {
    int arr[] = new int[5];
    int top = 0;
    public void push(int data){
        if(top == arr.length){
            System.out.println("Stack is full");
            return;}
        arr[top]=data;
        top++;
    }
    public int pop(){
        int data;
        top--;
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        data = arr[top];
        arr[top]= 0;
        return -1;
    }
    public int peek(){
        return arr[top--];
    }
    public void display(){
        for(int n :arr){
            System.out.print(n+" ");

        }
    }
}

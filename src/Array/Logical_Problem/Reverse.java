package Array.Logical_Problem;

public class Reverse {
    public static void reverse(int arr[]){
        int a = 0;
        int b = arr.length-1;
        while(a<b){
            int temp = arr[a];
             arr[a] = arr[b];
              arr[b] = temp;
            a++;
            b--;
        }
    }
    public static void display(int arr[])
    {
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }


    public   static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println("Before Swap :- ");
        display(arr);
        System.out.println("\nAfter swap :- ");
        reverse(arr);
        display(arr);

    }

}

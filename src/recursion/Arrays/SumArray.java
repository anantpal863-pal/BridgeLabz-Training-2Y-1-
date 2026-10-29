package recursion.Arrays;

public class SumArray {
    public static int add(int arr[],int ind)
    {
        if(ind== arr.length)
        {
            return 0;

        }
        int add = add(arr,ind+1);
        return add+arr[ind];
    }

    public static void main(String[] args) {
        int arr[] = {3,9,12,8,15};
        System.out.println(add(arr,0));
    }
}

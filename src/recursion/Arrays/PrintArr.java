package recursion.Arrays;

public class PrintArr {
public static void rev(int arr[],int index)
{
    if(index==arr.length)
    {
        return;

    }
    rev(arr,index+1);
    System.out.print(arr[index]+" ");
}public static void print(int arr[],int index)
    {
        if(index==arr.length)
        {
            return;

        }
        System.out.print(arr[index]+" ");
        print(arr,index+1);

    }


    public static void main(String[] args) {
        int arr[]= {1,6,4,8,26,48};
        print(arr,0);
        System.out.println(" ");
        rev(arr,0);
    }
}

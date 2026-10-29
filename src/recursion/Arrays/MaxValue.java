package recursion.Arrays;
import java.util.*;
public class MaxValue {
    public static int max(int arr[],int ind)
    {
        if(ind == arr.length-1)
        {
            return arr[ind];
        }
        int s = max(arr,ind+1);
        return Math.max(s,arr[ind]);
    }

    public static void main(String[] args) {
        int arr[]= {2,6,4,12,10};
        System.out.println(max(arr,0));
    }
}

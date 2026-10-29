package recursion.Arrays;

public class BinarySearch {
    public static int binary(int arr[],int start,int end ,int target){
        if(start>end){
            return -1;
        }
        int mid = start +(end-start)/2;
        if(arr[mid] == target){
            return mid;
        } else if (arr[mid]<target) {
            return binary(arr,mid+1,end ,target);

        }
        return binary(arr,start,mid-1 ,target);
    }

    public static void main(String[] args) {
        int arr[]= {1,22,24,64,88,100};
        System.out.println(binary(arr,0,arr.length-1,88));
    }
}

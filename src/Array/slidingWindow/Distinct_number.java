package Array.slidingWindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Distinct_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<=arr.length-k;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=i;j<i+k;j++){
                set.add(arr[j]);
            }
            list.add(set.size());
        }
        System.out.println(list);
    }
}

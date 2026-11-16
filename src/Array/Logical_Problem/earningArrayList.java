package Array.Logical_Problem;

import java.util.ArrayList;
import java.util.Arrays;

public class earningArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(0, 2);
        list.add(1, 5);
        list.add(2, 50);
        list.add(2, 8);
        list.add(1, 2);

        System.out.println(list);

        int arr[] = new int[list.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        System.out.println(Arrays.toString(arr));
    }
}
package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class leetcode_1365 {

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[j] < nums[i]) {
                    count++;
                }
            }

            res[i] = count;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = smallerNumbersThanCurrent(nums);

        System.out.println("New array: " + Arrays.toString(result));

        sc.close();
    }
}
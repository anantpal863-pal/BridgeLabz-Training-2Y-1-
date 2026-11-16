package Array.leetcode;

public class leetcode_238ProductExcept {

    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] left = new int[n];

        left[0] = 1;

        // Left product
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        int right = 1;


        for (int i = n - 1; i >= 0; i--) {
            left[i] = left[i] * right;
            right = right * nums[i];
        }

        return left;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        int[] result = productExceptSelf(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
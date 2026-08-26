

package Array.Logical_Problem;

public class Maximum {

    public static int maxElement(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int secMax(int arr[]) {

        int max = maxElement(arr);
        int secMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max && arr[i] > secMax) {
                secMax = arr[i];
            }
        }

        return secMax;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 6, 7};

        System.out.println("Maximum = " + maxElement(arr));
        System.out.println("Second Maximum = " + secMax(arr));
    }
}
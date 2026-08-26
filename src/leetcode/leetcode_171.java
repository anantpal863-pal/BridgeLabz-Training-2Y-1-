package leetcode;

import java.util.Scanner;

public class leetcode_171 {

    public static int titleToNumber(String col) {

        int p = 0;
        int sum = 0;
        int n = col.length();

        for (int i = n - 1; i >= 0; i--) {

            int temp = col.charAt(i) - 'A' + 1;

            sum += Math.pow(26, p) * temp;

            p++;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter column name: ");
        String col = sc.nextLine();

        int result = titleToNumber(col);

        System.out.println("Column number: " + result);

        sc.close();
    }
}
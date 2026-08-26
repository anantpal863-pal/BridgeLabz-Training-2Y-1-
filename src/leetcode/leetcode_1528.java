package leetcode;

import java.util.Scanner;

public class leetcode_1528 {

    public static String restoreString(String s, int[] index) {

        char[] res = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            res[index[i]] = s.charAt(i);
        }

        return new String(res);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        int[] index = new int[s.length()];

        System.out.println("Enter index values:");

        for (int i = 0; i < s.length(); i++) {
            index[i] = sc.nextInt();
        }

        String result = restoreString(s, index);

        System.out.println("Restored string: " + result);

        sc.close();
    }
}
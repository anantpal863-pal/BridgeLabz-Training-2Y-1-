package leetcode;

import java.util.Scanner;

public class leetcode_387 {

    public static int firstUniqChar(String s) {

        for (int i = 0; i < s.length(); i++) {

            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int result = firstUniqChar(s);

        System.out.println("First unique character index: " + result);

        sc.close();
    }
}
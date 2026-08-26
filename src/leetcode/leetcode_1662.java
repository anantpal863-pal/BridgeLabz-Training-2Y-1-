package leetcode;

import java.util.Scanner;

public class leetcode_1662 {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String s1 = "";
        String s2 = "";

        for (int i = 0; i < word1.length; i++) {
            s1 = s1 + word1[i];
        }

        for (int i = 0; i < word2.length; i++) {
            s2 = s2 + word2[i];
        }

        return s1.equals(s2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of word1: ");
        int n1 = sc.nextInt();

        String[] word1 = new String[n1];

        System.out.println("Enter word1 elements:");
        for (int i = 0; i < n1; i++) {
            word1[i] = sc.next();
        }

        System.out.print("Enter size of word2: ");
        int n2 = sc.nextInt();

        String[] word2 = new String[n2];

        System.out.println("Enter word2 elements:");
        for (int i = 0; i < n2; i++) {
            word2[i] = sc.next();
        }

        System.out.println("Are equal: " +
                arrayStringsAreEqual(word1, word2));

        sc.close();
    }
}
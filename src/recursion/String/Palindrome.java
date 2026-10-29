package recursion.String;

public class Palindrome {


    public static boolean pal(String s1, int ind) {


        if (ind >= s1.length() / 2) {
            return true;
        }

        char start = s1.charAt(ind);
        char end = s1.charAt(s1.length() - 1 - ind);


        if (start != end) {
            return false;
        }

        return pal(s1, ind + 1);
    }

    public static void main(String[] args) {
        String s1 = "madam";
        System.out.println(pal(s1, 0));
    }


}

package recursion.String;

public class Print {
    public static void print(String s1, int ind)
    {
        if(ind == s1.length()){
            return;
        }
        System.out.print(s1.charAt(ind));
        print(s1,ind+1);
    }

    public static void main(String[] args) {
        String s1 ="madam";
        print(s1,0);

    }

}

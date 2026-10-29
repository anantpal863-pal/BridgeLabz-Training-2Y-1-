package recursion.String;

public class RevPrint {
    public static void print(String s1, int ind)
    {
        if(ind == s1.length()){
            return;
        }
      print(s1,ind+1);
        System.out.print(s1.charAt(ind));

    }

    public static void main(String[] args) {
        String s1 ="masam";
        print(s1,0);

    }
}

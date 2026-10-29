package recursion.String;

public class RemoveChar {
    public static String remo(String s1,int ind)
    {
        if(ind == s1.length()){
            return "";
        }
        String small = remo(s1,ind+1);
        char ch = s1.charAt(ind);
        if(ch!='b')
        {
            return ch+small;
        }else{
            return small;
        }
    }

    public static void main(String[] args) {
        String s1 = "abcabc";
        System.out.println(remo(s1,0));
    }
}

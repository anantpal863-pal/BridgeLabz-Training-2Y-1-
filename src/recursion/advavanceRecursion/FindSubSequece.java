package recursion.advavanceRecursion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FindSubSequece {
    public static ArrayList<String> getssb(String s)
    {
        ArrayList<String> ans = new ArrayList<>();
        if(s.length()==0)
        {
            ans.add(" ");
            return ans;
        }
        char ch = s.charAt(0);
        ArrayList<String> small = getssb(s.substring(1));
        for(String ss:small)
        {
            ans.add(ss);
            ans.add(ch+ss);
        }
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        String s ="ABC";
        System.out.println(getssb(s));
    }
}

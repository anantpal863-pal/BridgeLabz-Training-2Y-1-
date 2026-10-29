package recursion.advavanceRecursion;

public class TowerOfHano {
    public static void tho(int n,char source, char helper,char dest)
    {
        if(n==1)
        {
            System.out.println("Move disk 1 from "+source+"to"+dest);
            return;
        }
        tho(n-1,source,dest,helper);
        System.out.println("move disk"+n+"from"+source+"to"+dest);
        tho(n-1,helper,source,dest);

    }

    public static void main(String[] args) {
        int n=3;
        tho(n,'a','b','c');
    }
}

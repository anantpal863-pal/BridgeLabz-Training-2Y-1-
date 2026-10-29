package recursion.BasicProblem;

public class fibonacci {
    public static int fibo(int n)
    {


        if(n==0||n==1)
        {
            return n;
        }
        int s1 = fibo(n-1);
        int s2 = fibo(n-2);
        return n= s1+s2;
    }

    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
}

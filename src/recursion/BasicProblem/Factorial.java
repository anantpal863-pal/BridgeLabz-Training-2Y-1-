package recursion.BasicProblem;

public class Factorial {
    public static int fac(int n)
    {
        if(n==1)
        {

            return 1;
        }
      return  n=n*fac(n-1);
    }
    public static int add(int n){
        if(n==1){
            return 1;
        }
        return n= n+add(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fac(5));
        System.out.println(add(6));
    }
}

package recursion.BasicProblem;

public class Gcd {
    public static int gcd(int x,int y)
    {
        if(y%x==0)
        {
          return x;
        }
      return  gcd(y%x,x);

    }

    public static void main(String[] args) {
        System.out.println("GCD:"+gcd(12,160));
        int hcf = gcd(12,18);
        System.out.println("LCM :"+(12*18)/hcf);
    }
}

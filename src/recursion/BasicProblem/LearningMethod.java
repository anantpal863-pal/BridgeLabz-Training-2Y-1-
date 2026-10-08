package recursion.BasicProblem;

public class LearningMethod {
   public static int add(int a,int b){
       return a+b;
   }
    public static void mul(int a,int b){
        System.out.println(a*b);
    }

    public static void main(String args[]){
        System.out.println(add(200,20));
        int res = add(100,60);
        System.out.println(res);
        mul(320,20);
    }


}

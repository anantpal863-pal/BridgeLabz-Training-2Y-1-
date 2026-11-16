package Array.slidingWindow;

import java.sql.SQLOutput;

public class SlindingWindow {
    public static void main(String []args){
        int nums[] = {1,2,3,4,5,6};
        int size = 3;
        int sum =0;
        int total =0;
        for(int i=0;i<size;i++){
            sum = sum + nums[i];
            total = total+sum;
        }
        System.out.println("this is the first sum of sum array :- "+sum);
        for(int i=1;i<=nums.length-size;i++){
            sum = sum - nums[i-1]+ nums[i+size-1];
            System.out.println(sum);
            total +=sum;

        }
        System.out.println(total);
    }
}

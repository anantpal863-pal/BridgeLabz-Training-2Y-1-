package leetcode;

public class leetcode_167 {
    public int[] twoSum(int[]     num, int target){
        int start =0;
        int end = num.length;
        while(start<num.length && end>0){
            if (num[start]+num[end]>target){
                end--;
            }
            if(num[start]+num[end]<target){
                start++;
            }if(num[start]+num[end]==target){
                return new int[]{start+1,end+1};
            }

        }
        return  new int[]{-1,1};
    }
}

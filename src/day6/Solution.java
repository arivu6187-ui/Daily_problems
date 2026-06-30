package day6;

public class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] num=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            num[i]=nums[i];
            num[i+nums.length]=nums[i];
        }

        return num;

    }
}

package day18;

import java.util.Arrays;

public class SquareSorted {
    static void main() {
        int[] nums={1,5,6,8,9};
        int n=nums.length;
        int[] ans=new int[n];
        int right=n-1;
        int left=0;
        int index=n-1;
        while(left<=right){
            int sleft=nums[left]*nums[left];
            int sright=nums[right]*nums[right];
            if(sleft>sright){
                ans[index]=sleft;
                left++;
            }
            else{
                ans[index]=sright;
                right--;
            }
            index--;
        }
        System.out.println(Arrays.toString(ans));
    }
}

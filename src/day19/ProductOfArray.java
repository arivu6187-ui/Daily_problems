package day19;

import java.util.Arrays;

public class ProductOfArray {
    static void main() {
        int[] nums={1,5,6,8,9};
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){int total=1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    total=total*nums[j];
                }
            }ans[i]=total;
        }
        System.out.println(Arrays.toString(ans));
        return;
    }
}

package day19;

public class FindPivot {
    static void main() {
        int[] nums={1,5,6,8,9};
        int sum=0;
        int lsum=0;
        int rsum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            rsum=0;
            rsum=sum-nums[i]-lsum;
            if(lsum==rsum){
                System.out.println(i);
                return ;
            }
            lsum=lsum+nums[i];
        }
        System.out.println(-1);
        return;
    }
}

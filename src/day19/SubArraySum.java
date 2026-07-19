package day19;

public class SubArraySum {
    public static void main(String[] args) {
        int[] nums ={1,3,5,8,9};
        int k=7;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k){
                System.out.println(true);
                return ;
            }
        }
        System.out.println(false);
        return ;
    }
}

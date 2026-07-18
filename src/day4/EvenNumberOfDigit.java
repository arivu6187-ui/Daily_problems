package day4;

public class EvenNumberOfDigit {
    static void main() {
        int[] nums={12,542,56,25,36};
        int[] count=new int[nums.length];
        int total=0,digit=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=0){
                digit=nums[i]%10;
                nums[i]=nums[i]/10;
                count[i]++;
            }
            if(count[i]%2==0){
                total++;}
        }
        System.out.println(total);
    }
}

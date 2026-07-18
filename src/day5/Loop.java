package day5;
public class Loop {
    public static void main(String[] args) {
        int[] nums={1,5,6,4,8};
        int[] count = new int[nums.length];
        int total = 0, digit = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != 0) {
                digit = nums[i] % 10;
                nums[i] = nums[i] / 10;
                count[i]++;
            }
            if (count[i] % 2 == 0) {
                total++;
            }
        }
        System.out.println(total);
    }
}

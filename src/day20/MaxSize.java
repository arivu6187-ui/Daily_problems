package day20;

public class MaxSize {
    public static void main(String[] args) {
        int[] nums={1,5,6,7,8};
        int target=5;
        int minLength = Integer.MAX_VALUE;
        int currentSum = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];

            // Shrink the window from the left as long as the condition is met
            while (currentSum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                currentSum -= nums[left];
                left++;
            }
        }

        // If minLength wasn't updated, it means no valid subarray was found
        System.out.println(minLength == Integer.MAX_VALUE ? 0 : minLength);
    }
}

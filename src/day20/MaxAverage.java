package day20;

public class MaxAverage {
    static void main() {
        int[] nums={1,5,6,8,9};
        int k=9;
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        int maxSum = currentSum;

        // Step 2: Slide the window across the rest of the array
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }

        // Step 3: Return the maximum average
        System.out.println((double) maxSum / k);
    }
}

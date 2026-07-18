package day4;
import java.util.HashSet;
import java.util.Set;

public class MinimumOperation {
    static void main() {
        int[] nums={3,1,5,4,2};
        Set<Integer> collected = new HashSet<>();
        int operations = 0,k=2;

        // Traverse the array from right to left
        for (int i = nums.length - 1; i >= 0; i--) {
            operations++;

            // Collect elements that are between 1 and k
            if (nums[i] <= k) {
                collected.add(nums[i]);
            }

            // Once we have collected all elements from 1 to k, return the operation count
            if (collected.size() == k) {
                System.out.println("Minimum operations are: " + operations);
                return;
            }
        }

    }

}

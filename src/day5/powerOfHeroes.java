package day5;
import java.util.Arrays;

public class powerOfHeroes {
    static void main() {
        int[] nums={1,5,9};
            long mod = 1_000_000_007L;

            // Step 1: Sort the array
            Arrays.sort(nums);

            long totalPower = 0;
            long prefixSum = 0;

            // Step 2: Iterate and compute power contributions
            for (int i = 0; i < nums.length; i++) {
                long val = nums[i];
                long valSq = (val * val) % mod;

                // Contribution where nums[i] is the maximum
                long currentContribution = (valSq * ((prefixSum + val) % mod)) % mod;
                totalPower = (totalPower + currentContribution) % mod;

                // Step 3: Update prefixSum for the next iteration
                prefixSum = (prefixSum * 2 + val) % mod;
            }

        System.out.println("Total Power = "+totalPower);
        }
    }



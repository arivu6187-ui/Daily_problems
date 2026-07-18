package day10;

public class DigitGame {
    public static void main(String[] args) {
        int[] nums={1,5,3,6,8};
        int singleDigitSum = 0;
        int doubleDigitSum = 0;

        // Separate and calculate the sums of single-digit and double-digit numbers
        for (int num : nums) {
            if (num < 10) {
                singleDigitSum += num;
            } else {
                doubleDigitSum += num;
            }
        }

        // Alice wins if either group's sum is strictly greater than the other group's sum
        System.out.println(singleDigitSum != doubleDigitSum);
    }
}

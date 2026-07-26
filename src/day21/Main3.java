package day21;

public class Main3 {

    public static int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;

        for (int w : weights) {
            left = Math.max(left, w);
            right += w;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            int need = 1;
            int curr = 0;

            for (int w : weights) {
                if (curr + w > mid) {
                    need++;
                    curr = 0;
                }
                curr += w;
            }

            if (need <= days)
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }

    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;

        System.out.println(shipWithinDays(weights, days));
    }
}
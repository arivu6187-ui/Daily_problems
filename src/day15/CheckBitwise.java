package day15;

public class CheckBitwise {
    static void main() {
        int[] nums={1,2,3,4,5};
                int evenCount = 0;

                for (int num : nums) {
                    if (num % 2 == 0) {
                        evenCount++;
                    }
                    if (evenCount >= 2) {
                        System.out.println(true);
                        return;
                    }
                }
                System.out.println(false);
                return ;
    }
}

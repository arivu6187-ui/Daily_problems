package day4;

public class PrimeNumber {
    static void main() {
        int left=20,right=50;
            int primeMask = 0b1010001010001010110010110;
            int count = 0;

            for (int i = left; i <= right; i++) {
                // Integer.bitCount counts the number of set bits (1s)
                int setBits = Integer.bitCount(i);

                // Check if the bit at position 'setBits' is 1 in our prime mask
                if (((primeMask >> setBits) & 1) == 1) {
                    count++;
                }
            }
            System.out.println(count);
        }
}

package day15;

public class SmallestNumber {
    static void main() {
        int n=7;
        int result = 1;

        // Keep shifting left and adding 1 until the value is >= n
        while (result < n) {
            result = (result << 1) | 1;
        }
        System.out.println(result);
        return ;
    }
}

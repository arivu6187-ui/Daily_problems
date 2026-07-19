package day11;

public class CategorizeBox {
    static void main() {
        int length = 1000, width = 35, height = 700, mass = 300;
        long volume = (long) length * width * height;

        // Define the threshold constants
        long dimLimit = 10000;       // 10^4
        long volLimit = 1000000000;  // 10^9

        // Check conditions
        boolean isBulky = length >= dimLimit || width >= dimLimit || height >= dimLimit || volume >= volLimit;
        boolean isHeavy = (mass >= 100);

        // Return category based on the combinations
        if (isBulky && isHeavy) {
            System.out.println("Both");
            return;
        } else if (!isBulky && !isHeavy) {
             System.out.println("Neither");
             return;
        } else if (isBulky) {
            System.out.println("Bulky");
            return ;
        } else {
            System.out.println("Heavy");
            return;
        }
    }
}

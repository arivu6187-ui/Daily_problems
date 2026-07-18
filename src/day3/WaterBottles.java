package day3;

public class WaterBottles {
    static void main() {
        int numBottles=15;
        int numExchange=4;
        int totalDrunk = numBottles;
        int emptyBottles = numBottles;
        while (emptyBottles >= numExchange) {
            int newBottles = emptyBottles / numExchange;
            totalDrunk += newBottles;

            emptyBottles = newBottles + (emptyBottles % numExchange);
        }
        System.out.println(emptyBottles);

    }
}

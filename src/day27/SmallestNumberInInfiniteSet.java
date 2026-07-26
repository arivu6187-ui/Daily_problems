package day27;

import java.util.PriorityQueue;

public class SmallestNumberInInfiniteSet {

    public static void main(String[] args) {

        SmallestInfiniteSet obj = new SmallestInfiniteSet();

        System.out.println(obj.popSmallest());
        System.out.println(obj.popSmallest());

        obj.addBack(1);

        System.out.println(obj.popSmallest());
        System.out.println(obj.popSmallest());
    }
}

class SmallestInfiniteSet {

    PriorityQueue<Integer> pq;
    boolean[] used;
    int current;

    public SmallestInfiniteSet() {
        pq = new PriorityQueue<>();
        used = new boolean[1001];
        current = 1;
    }

    public int popSmallest() {

        if (!pq.isEmpty()) {
            int value = pq.poll();
            used[value] = false;
            return value;
        }

        return current++;
    }

    public void addBack(int num) {

        if (num < current && !used[num]) {
            pq.offer(num);
            used[num] = true;
        }
    }
}

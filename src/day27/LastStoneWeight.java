package day27;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {

    public static void main(String[] args) {

        int[] stones = {2, 7, 4, 1, 8, 1};

        Solution2 obj = new Solution2();

        System.out.println(obj.lastStoneWeight(stones));
    }
}

class Solution2 {

    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            pq.offer(stone);
        }

        while (pq.size() > 1) {

            int first = pq.poll();
            int second = pq.poll();

            if (first != second) {
                pq.offer(first - second);
            }
        }

        if (pq.isEmpty()) {
            return 0;
        }

        return pq.poll();
    }
}

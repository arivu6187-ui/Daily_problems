package day27;

import java.util.PriorityQueue;

public class FurthestBuildingYouCanReach {

    public static void main(String[] args) {

        int[] heights = {4, 2, 7, 6, 9, 14, 12};
        int bricks = 5;
        int ladders = 1;

        Solution obj = new Solution();

        System.out.println(obj.furthestBuilding(heights, bricks, ladders));
    }
}

class Solution {

    public int furthestBuilding(int[] heights, int bricks, int ladders) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < heights.length - 1; i++) {

            int climb = heights[i + 1] - heights[i];

            if (climb > 0) {

                pq.offer(climb);

                if (pq.size() > ladders) {
                    bricks -= pq.poll();
                }

                if (bricks < 0) {
                    return i;
                }
            }
        }

        return heights.length - 1;
    }
}
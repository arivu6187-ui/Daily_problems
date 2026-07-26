package day27;

import java.util.PriorityQueue;

public class KthLargestElement {

    public static void main(String[] args) {

        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        Solution obj = new Solution();

        System.out.println(obj.findKthLargest(nums, k));
    }
}

class Solution1 {

    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {

            pq.offer(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
    }
}

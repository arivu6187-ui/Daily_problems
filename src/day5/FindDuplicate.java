package day5;

import org.w3c.dom.ls.LSOutput;

public class FindDuplicate {
    static void main() {

            int[] nums={50,2,6,2,8};
            int tortoise = nums[0];
            int hare = nums[0];

            // Step 2: Find the intersection point in the cycle
            do {
                tortoise = nums[tortoise];
                hare = nums[nums[hare]];
            } while (tortoise != hare);

            // Step 3: Find the entrance to the cycle (the duplicate)
            tortoise = nums[0];
            while (tortoise != hare) {
                tortoise = nums[tortoise];
                hare = nums[hare];
            }
            System.out.println("Total Power = "+tortoise);

        }

    }



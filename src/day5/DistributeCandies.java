package day5;

public class DistributeCandies {
    static void main() {
       int candies=7;
       int num_people=2;
                int[] ans = new int[num_people];
                int give = 1;
                int i = 0;

                while (candies > 0) {
                    // Give either the current required amount or whatever is left
                    int actualGive = Math.min(candies, give);
                    ans[i] += actualGive;
                    candies -= actualGive;

                    // Move to the next person (wrap around if at the end)
                    i = (i + 1) % num_people;
                    // Increment the amount of candies for the next turn
                    give++;
                }
        System.out.println(ans[i]);


            }
        }

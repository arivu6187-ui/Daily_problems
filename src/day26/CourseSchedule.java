package day26;

import java.util.*;

public class CourseSchedule {

    public static void main(String[] args) {

        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};

        Solution obj = new Solution();

        System.out.println(obj.canFinish(numCourses, prerequisites));
    }
}

class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        int[] indegree = new int[numCourses];

        for (int[] p : prerequisites) {
            graph.get(p[1]).add(p[0]);
            indegree[p[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        int count = 0;

        while (!queue.isEmpty()) {

            int current = queue.poll();
            count++;

            for (int next : graph.get(current)) {
                indegree[next]--;

                if (indegree[next] == 0) {
                    queue.offer(next);
                }
            }
        }

        return count == numCourses;
    }
}

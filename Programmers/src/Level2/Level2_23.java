package Level2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Level2_23 {
    public static int solution(int[][] jobs) {
        Arrays.sort(jobs, ((o1, o2) -> o1[0] - o2[0]));

        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

        int count = 0;
        int index = 0;
        int end = 0;
        int total = 0;

        while (count < jobs.length) {
            while (index < jobs.length && jobs[index][0] <= end) {
                pq.add(jobs[index++]);
            }

            if (pq.isEmpty()) {
                end = jobs[index][0];
            } else {
                int[] cur = pq.poll();
                total += cur[1] + end - cur[0];
                end += cur[1];
                count++;
            }
        }
        return total / jobs.length;

    }

    public static void main(String[] args) {
        int[][] arr = {{1, 9}, {0, 3},{2, 6}};
        solution(arr);
    }
}

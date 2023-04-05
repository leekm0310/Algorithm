import java.util.Collections;
import java.util.PriorityQueue;

public class Leetcode1046 {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            q.offer(stone);
        }

        while (q.size() > 1) {
            Integer x = q.poll();
            Integer y = q.poll();

            if (x > y) {
                q.offer(x - y);
            } else if (x < y) {
                q.offer(y - x);
            }
        }

        if (q.isEmpty()) {
            return 0;
        }
        return q.poll();
    }

    public static void main(String[] args) {
        int[] arr = {2, 2};
        System.out.println(lastStoneWeight(arr));
    }
}

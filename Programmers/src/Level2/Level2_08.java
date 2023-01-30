package Level2;

import java.util.Collections;
import java.util.PriorityQueue;

public class Level2_08 {
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < priorities.length; i++) {
            queue.add(priorities[i]);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == queue.peek()) {
                    if (i == location) {
                        answer++;
                        return answer++;
                    }
                    queue.poll();
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 9, 1, 1, 1};
        solution(a, 0);
    }
}

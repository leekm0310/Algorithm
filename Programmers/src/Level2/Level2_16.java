package Level2;

import java.util.PriorityQueue;

public class Level2_16 {
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i : scoville) {
            queue.add(i);
        }


        while (queue.peek() < K && queue.size() >= 2) {
            Integer m1 = queue.poll();
            Integer m2 = queue.poll();
            int mix = m1 + (m2 * 2);
            queue.add(mix);
            answer++;
        }

        if (queue.peek() < K) {
            return -1;
        }


        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 10, 15, 2};
        System.out.println(solution(arr, 7));
    }
}

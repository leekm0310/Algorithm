package Level2;

import java.util.Collections;
import java.util.PriorityQueue;

public class Level2_03 {
    public static int solution(int[] A, int[] B) {
        int answer = 0;
        PriorityQueue<Integer> a = new PriorityQueue<>();
        PriorityQueue<Integer> b = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < A.length; i++) {
            a.add(A[i]);
            b.add(B[i]);
        }

        while (!a.isEmpty()) {
            answer += a.poll() * b.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 2};
        int[] b = {5, 4, 4};
        System.out.println(solution(a, b));

    }
}

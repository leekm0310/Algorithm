package Level2;

import java.util.Arrays;
import java.util.Collections;

public class Level2_03 {
    public static int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Integer[] b = Arrays.stream(B).boxed().toArray(Integer[]::new);
        Arrays.sort(b, Collections.reverseOrder());
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * b[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 2};
        int[] b = {5, 4, 4};
        System.out.println(solution(a, b));
    }
}

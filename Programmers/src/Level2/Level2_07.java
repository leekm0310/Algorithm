package Level2;

public class Level2_07 {
    public long solution(int n) {
        long[] answer = new long[n + 1];
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        answer[0] = 0;
        answer[1] = 1L;
        answer[2] = 2L;

        for (int i = 3; i <= n; i++) {
            answer[i] = (answer[i - 2] + answer[i - 1]) % 1234567;
        }


        return answer[n];
    }
}

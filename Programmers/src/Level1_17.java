public class Level1_17 {
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        for (int i = 1; i <= max; i++) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
            }
        }
        if (answer[0] == 1) {
            answer[1] = n * m;
        } else {
            int i = max / answer[0];
            answer[1] = i * min;
        }
        return answer;
    }

    public static void main(String[] args) {
        solution(3, 12);
    }
}

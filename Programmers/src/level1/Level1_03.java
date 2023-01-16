package level1;

public class Level1_03 {
    public static long solution(long n) {
        long answer = -1;
        if (n == 1) {
            return 4;
        }
        for (long i = 0; i < n / 4; i++) {
            if (i * i == n) {
                return (i + 1) * (i + 1);
            } else if (i * i > n) {
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1));
    }
}

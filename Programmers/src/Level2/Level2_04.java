package Level2;

public class Level2_04 {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n / 2 + 1; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;

                if (sum == n) {
                    answer++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(15));
    }
}

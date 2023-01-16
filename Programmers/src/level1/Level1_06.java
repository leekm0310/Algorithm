package level1;

public class Level1_06 {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                return i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(12));
    }
}

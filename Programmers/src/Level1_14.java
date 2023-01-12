public class Level1_14 {
    public static int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int count = 2;
            if (i == 1) {
                count = 1;
            }

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
            count = 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1, 2));
    }
}

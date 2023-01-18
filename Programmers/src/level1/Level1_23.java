package level1;

public class Level1_23 {
    public static int solution(int n) {
        int answer = 0;
        boolean[] check = new boolean[n + 1];
        if (n < 2) {
            return answer;
        }
        check[0] = check[1] = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (check[i] == true) {
                continue;
            }
            for (int j = i * i; j < check.length; j = j + i) {
                check[j] = true;
            }
        }

        for (int i = 0; i < check.length; i++) {
            if (check[i] == false) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}

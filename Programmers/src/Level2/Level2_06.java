package Level2;

public class Level2_06 {
    public int solution(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return solution(n - 1) + solution(n - 2);
        }
    }
}

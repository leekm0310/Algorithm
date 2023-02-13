public class Inflearn1002 {
    static int[] dy;

    static int solution(int n) {
        dy = new int[n + 1];
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i - 1] + dy[i - 2];
        }
        return dy[n-1] + dy[n];
    }

    public static void main(String[] args) {
        System.out.println(solution(7));
    }
}

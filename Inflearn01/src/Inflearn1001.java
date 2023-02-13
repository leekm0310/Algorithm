public class Inflearn1001 {
    static int[] dy;

    public static int solution(int n) {
        dy = new int[n+1];
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i - 1] + dy[i - 2];
        }
        return dy[n];
    }

    public static void main(String[] args) {
        System.out.println(solution(4));
    }
}

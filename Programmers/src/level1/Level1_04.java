package level1;

public class Level1_04 {
    public static boolean solution(int x) {
        boolean answer = false;
        int a = x;
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a = a / 10;
        }
        if (x % sum == 0) {
            answer = true;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(13));
    }
}

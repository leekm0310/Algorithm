package level1;

public class Level1_28 {
    public static int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            answer += (n / a) * b;
            n = (n / a) * b + n % a;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3,1,20));
    }
}

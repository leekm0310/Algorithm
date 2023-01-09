import java.util.ArrayList;
import java.util.List;

public class Level1_01 {
    public static List<Long> solution(long n) {
        List<Long> answer = new ArrayList<>();
        while (n > 0) {
            answer.add(n % 10);
            n = n / 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        List<Long> solution = solution(12345);
        for (Long i : solution) {
            System.out.print(i + " ");
        }
    }
}

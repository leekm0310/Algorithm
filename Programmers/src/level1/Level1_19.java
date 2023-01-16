package level1;

import java.util.ArrayList;
import java.util.List;

public class Level1_19 {
    public static int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        while (n != 0) {
            list.add(n % 3);
            n = n / 3;
        }
        int a = 1;
        for (int i = list.size() - 1; i >= 0; i--) {
            answer += list.get(i) * a;
            a *= 3;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(45));
    }
}

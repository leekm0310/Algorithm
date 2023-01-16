package level1;

import java.util.Arrays;

public class Level1_05 {
    public static long solution(long n) {
        long answer = 0;

        String[] split = String.valueOf(n).split("");
        Arrays.sort(split);
        StringBuilder sb = new StringBuilder();
        for (String s : split) {
            sb.append(s);
        }
        answer = Long.parseLong(sb.reverse().toString());

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
}

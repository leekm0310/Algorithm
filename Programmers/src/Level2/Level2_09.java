package Level2;

import java.util.ArrayList;
import java.util.List;

public class Level2_09 {
    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (list.contains(words[i])) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;
            }

            list.add(words[i]);
            if (i > 0 && words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                return answer;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        String[] a = {"hello", "one", "even", "never", "now", "world", "draw"};
        int[] answer = solution(2, a);
        for (int i : answer) {
            System.out.println(i);
        }

    }
}

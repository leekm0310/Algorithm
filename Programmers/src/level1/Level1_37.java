package level1;

import java.util.ArrayList;
import java.util.Collections;

public class Level1_37 {
    public static String[] solution(String[] strings, int n) {
        String[] answer = {};

        ArrayList<String> list = new ArrayList<>();
        for (String s : strings) {
            list.add(s.charAt(n) + s);
        }
        Collections.sort(list);
        answer = new String[strings.length];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] arr = {"abce", "abcd", "cdx"};
        String[] solution = solution(arr, 2);
        for (String s : solution) {
            System.out.println(s);
        }
    }
}

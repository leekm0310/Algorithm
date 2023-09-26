package Level3;

import java.util.Arrays;

public class Level3_01 {
    public static void main(String[] args) {
        String ex = "ccc";
        System.out.println(solution(ex));

    }

    public static String solution(String input_string) {
        String answer = "";
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        boolean[] check = new boolean[26];

        int pointer = 0;

        while (pointer < input_string.length()) {
            char c = input_string.charAt(pointer);
            while (pointer + 1 < input_string.length() && c == input_string.charAt(pointer + 1)) {
                pointer++;
            }

            if (check[alphabets.indexOf(c)] == true && answer.indexOf(c) == -1) {
                answer += c;
            }
            check[alphabets.indexOf(c)] = true;
            pointer++;

        }
        if (answer == "") {
            return "N";
        }

        char[] chars = answer.toCharArray();
        Arrays.sort(chars);

        return new String(chars);

    }
}

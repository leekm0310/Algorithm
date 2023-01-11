import java.util.Arrays;

public class Level1_13 {
    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }
}

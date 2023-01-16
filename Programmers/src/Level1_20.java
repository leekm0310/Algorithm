import java.util.Arrays;

public class Level1_20 {
    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();

        char[] chars = s.toCharArray();
        int count = 0;
        for (char c : chars) {
            if (c == ' ') {
                sb.append(' ');
                count = 0;
            } else {
                if (count % 2 == 0 && c >= 97) {
                    sb.append((char) (c - 32));
                } else if (count % 2 != 0 && c < 97) {
                    sb.append((char) (c + 32));
                } else {
                    sb.append(c);
                }
                count++;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
//        String a = "  abc";
//        System.out.println(solution(a));

        System.out.println(solution(" aaaa ") + ".");

    }
}

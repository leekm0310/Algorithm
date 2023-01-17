package level1;

public class Level1_21 {
    public static String solution(String s, int n) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                if (chars[i] <= 90 && chars[i] + n > 90) {
                    chars[i] = (char) (chars[i] + n - 26);
                } else if (chars[i] >= 90 && chars[i] + n > 122) {
                    chars[i] = (char) (chars[i] + n - 26);
                } else {
                    chars[i] = (char) (chars[i] + n);
                }
            }
        }
        return String.valueOf(chars);
    }


}

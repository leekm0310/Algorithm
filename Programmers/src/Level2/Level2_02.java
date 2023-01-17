package Level2;

public class Level2_02 {
    public static String solution(String s) {
        char[] c = s.toCharArray();
        c[0] = Character.toUpperCase(c[0]);
        for (int i = 1; i < c.length; i++) {
            if (Character.isLetter(c[i]) && c[i-1] == ' ' ) {
                c[i] = Character.toUpperCase(c[i]);
            } else if (Character.isLetter(c[i])) {
                c[i] = Character.toLowerCase(c[i]);
            }
        }
        return new String(c);

    }
    public static void main(String[] args) {
        String a1 = "3people unFollowed me";
        String a2 = "for the last week";
        System.out.println(solution("  a a a"));
    }
}

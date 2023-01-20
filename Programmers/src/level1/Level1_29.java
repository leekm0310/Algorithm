package level1;

public class Level1_29 {
    public static int solution(String t, String p) {
        int answer = 0;
        Long intP = Long.valueOf(p);
        for (int i = 0; i <= t.length() - p.length(); i++) {
            if (intP >= Long.valueOf(t.substring(i, i + p.length()))) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        solution("10203", "15");
    }
}

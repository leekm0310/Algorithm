package level1;

public class Level1_26 {
    public static int solution(String s) {
        int answer = 0;
        int c1 = 0;
        int c2 = 0;
        char c = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            if (c1 == c2) {
                answer ++;
                c1 = 0;
                c2 = 0;
                c = s.charAt(i);
            }
            if (s.charAt(i) == c) {
                c1++;
            } else {
                c2++;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("banana"));
    }
}

package level1;

public class Level1_15 {
    public static boolean solution(String s) {
        boolean answer = false;
        if (s.length() == 4 | s.length() == 6) {
            for (int i = 0; i < 10; i++) {
                s = s.replaceAll(String.valueOf(i), "");
            }
            if (s.equals("")) {
                answer = true;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("00000"));
    }
}

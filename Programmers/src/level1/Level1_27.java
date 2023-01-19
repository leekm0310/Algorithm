package level1;

public class Level1_27 {
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = -1;
        }
        int count = 1;

        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i-1; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    answer[i] = count;
                    count = 1;
                    break;
                } else {
                    count++;
                }
            }
            count= 1;
        }
        return answer;
    }

}

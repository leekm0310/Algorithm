package level1;

import java.util.Arrays;

public class Level1_31 {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (reserve[i] == lost[j]) {
                    reserve[i] = 0;
                    lost[j] = 0;
                    answer++;
                }
            }
        }


        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (lost[j] != 0 && reserve[i] != 0 && (reserve[i] - 1 == lost[j] || reserve[i] + 1 == lost[j])) {
                    answer++;
                    lost[j] = 0;
                    reserve[i] = 0;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] lost = {1,2,4};
        int[] reserve = {1,2,5};
        System.out.println(solution(5, lost, reserve));
    }
}

package level1;

public class Level1_33 {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] rule = {6, 6, 5, 4, 3, 2, 1};
        int count = 0;
        int p = 0;
        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == 0) {
                    p++;
                    break;
                }
                if (lottos[i] == win_nums[j]) {
                    count++;
                }
            }
        }

        answer[0] = rule[count + p];
        answer[1] = rule[count];

        return answer;
    }

    public static void main(String[] args) {
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win = {38, 19, 20, 40, 15, 25};
        int[] solution = solution(lottos, win);
        for (int i : solution) {
            System.out.println(i);
        }
    }
}

package Level2;

public class Level2_15 {
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int width, height = 0;
        for (int i = 1; i <= yellow; i++) {
            if (yellow % i == 0) {
                height = Math.min(i, yellow / i);
                width = Math.max(i, yellow / i);
                if ((height + 2) * (width + 2) == brown + yellow) {
                    answer[0] = width + 2;
                    answer[1] = height + 2;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] solution = solution(4004, 999999);
        for (int i : solution) {
            System.out.println(i);
        }
    }
}

package level1;

public class Level1_34 {
    public static int[] solution(int N, int[] stages) {

        int[] check = new int[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i + 1) {
                    check[i]++;
                }
            }
        }

        double[] arr = new double[N];

        int stage = stages.length;
        for (int i = 0; i < check.length; i++) {
            int on = check[i];
            if (stage == 0) {
                arr[i] = 0;
            } else {
                arr[i] = (double) on / stage;
            }
            stage -= check[i];

        }
        int[] answer = new int[N];
        double max = 0;
        int target = 1;

        for (int i = 0; i < arr.length; i++) {
            max = arr[0];
            target = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    target = j + 1;
                }
            }
            arr[target - 1] = -1;
            answer[i] = target;
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] solution = solution(n, arr);
        for (int i : solution) {
            System.out.println(i);
        }
    }
}

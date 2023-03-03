package level1;

public class Level1_35 {
    static int temp[] = new int[3];
    static int count;

    public static int solution(int[] number) {
        DFS(number, 0, 0);
        return count;
    }

    private static void DFS(int[] number, int index, int depth) {
        if (depth == 3) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += temp[i];
            }
            if (sum == 0) {
                count++;
            }
            return;
        }

        for (int i = index; i < number.length; i++) {
            temp[depth] = number[i];
            DFS(number,i + 1, depth + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {-3, -2, -1, 0, 1, 2, 3};
        System.out.println(solution(arr));
    }

}

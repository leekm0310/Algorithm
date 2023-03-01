package Level2;

public class Level2_11 {
    public static int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    private static int dfs(int[] numbers, int target, int sum, int i) {
        int answer = 0;
        if (i == numbers.length) {
            if (target == sum) {
                return 1;
            }
            return 0;
        }
        answer += dfs(numbers, target, sum + numbers[i], i + 1);
        answer += dfs(numbers, target, sum + numbers[i] * -1, i + 1);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1};
        System.out.println(solution(arr, 3));
    }
}

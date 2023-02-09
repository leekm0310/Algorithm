import java.util.Arrays;

public class Practice8 {
    public int count(int[] arr, int capacity) {
        int count = 1;
        int sum = 0;
        for (int i : arr) {
            if (sum + i > capacity) {
                count++;
                sum = i;
            } else sum += i;
        }

        return count;
    }

    public int solution(int n, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) <= n) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }
}

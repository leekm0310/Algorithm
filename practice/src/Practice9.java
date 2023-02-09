import java.util.Arrays;

public class Practice9 {
    public int solution(int n, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = arr[0];
        int rt = arr[arr.length - 1];
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) >= n) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        return answer;
    }

    private int count(int[] arr, int mid) {
        int cnt = 1;
        int ep = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - ep >= mid) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }
}

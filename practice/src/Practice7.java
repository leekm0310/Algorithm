import java.util.Arrays;

public class Practice7 {
    //이분검색
    public int solution(int n, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 0;
        int rt = arr.length - 1;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] == n) {
                answer = mid + 1;
                break;
            }
            if (arr[mid] > n) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }
}

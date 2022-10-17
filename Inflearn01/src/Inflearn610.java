import java.util.Arrays;
import java.util.Scanner;

public class Inflearn610 {
    public static int count(int[] arr, int distance) {
        int cnt = 1;
        int endpoint = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - endpoint >= distance) {
                cnt ++;
                endpoint = arr[i];
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int c = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);

        int answer = 0;
        int lt = 1;
        int rt = arr[n - 1];
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        System.out.println(answer);
    }
}

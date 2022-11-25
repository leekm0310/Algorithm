import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Inflearn85 {

    static int n;
    static int m;
    static int answer = Integer.MAX_VALUE;

    void DFS(int L, int sum,  Integer[] arr) {
        if (sum > m) {
            return;
        }
        if (L >= answer) {
            return;
        }
        if (sum == m) {
            answer = Math.min(answer, L);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(L + 1, sum + arr[i], arr);
            }
        }
    }


    public static void main(String[] args) {
        Inflearn85 inflearn85 = new Inflearn85();
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        m = scn.nextInt();
        inflearn85.DFS(0, 0, arr);
        System.out.println(answer);
    }
}

import java.util.*;

public class Inflearn31 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] a = new int[200];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }

        int m = scn.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scn.nextInt();
        }

        List<Integer> answer = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;

        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2]) {
                answer.add(a[p1]);
                p1++;
            } else {
                answer.add(b[p2]);
                p2++;
            }
        }
        while (p1 < n) {
            answer.add(a[p1]);
            p1++;
        }
        while (p2 < m) {
            answer.add(b[p2]);
            p2++;
        }

        for (int x : answer) {
            System.out.print(x + " ");
        }
    }
}

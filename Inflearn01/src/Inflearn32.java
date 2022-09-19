import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Inflearn32 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }

        int m = scn.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scn.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        List<Integer> arr = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;
        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2]) {
                p1++;
            } else if (a[p1] == b[p2]) {
                arr.add(a[p1]);
                p1++;
                p2++;
            } else {
                p2++;
            }
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }

    }
}

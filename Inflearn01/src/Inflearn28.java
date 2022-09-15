import java.util.Scanner;

public class Inflearn28 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = scn.nextInt();
        }

        int cnt = 1;
        int[] result = new int[n];
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores.length; j ++) {
                if (scores[i] < scores[j]) {
                    cnt++;
                }
            }
            result[i] = cnt;
            cnt = 1;
        }

        for (int x : result) {
            System.out.print(x +" ");
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class B14467 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] cows = new int[11];
        Arrays.fill(cows, -1);
        int count = 0;

        for (int i = 0; i < N; i++) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            if (cows[a] != -1 && cows[a] != b) {
                count++;
            }
            cows[a] = b;
        }
        System.out.println(count);
    }
}

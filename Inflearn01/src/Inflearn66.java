import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Inflearn66 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int[] tmp = arr.clone();
        Arrays.sort(tmp);

        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] != tmp[i]) {
                answer.add(i + 1);
            }
        }

        for (int x : answer) {
            System.out.print(x + " ");
        }
    }
}

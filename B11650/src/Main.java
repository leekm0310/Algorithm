import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();

        int[][] arr = new int[a][2];

        for (int i = 0; i < a; i ++) {
            arr[i][0] = scn.nextInt();
            arr[i][1] = scn.nextInt();
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });

        for (int i = 0; i < a; i ++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}

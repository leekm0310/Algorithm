import java.util.Scanner;

public class Inflearn24 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int cases = scn.nextInt();
        int[] arr = new int[cases];
        for (int i = 0; i < cases; i++) {
            if (i == 0 || i == 1) {
                arr[i] = 1;
            } else {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            System.out.print(arr[i] + " ");
        }
    }
}

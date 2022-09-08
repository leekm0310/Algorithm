import java.util.Scanner;

public class Inflearn21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int cases = scn.nextInt();
        int[] arr = new int[cases];
        for (int i = 0; i < cases; i++) {
            arr[i] = scn.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print(arr[i] + " ");
            } else if (arr[i] > arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

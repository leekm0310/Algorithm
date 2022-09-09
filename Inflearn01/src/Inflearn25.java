import java.util.Scanner;

public class Inflearn25 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int cases = scn.nextInt();
        int answer = 0;
        int[] arr = new int[cases + 1];
        for (int i = 2; i <= cases; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j = i; j <= cases; j = j + i) {
                    arr[j] = 1;
                }
            }
        }
        System.out.println(answer);
    }
}

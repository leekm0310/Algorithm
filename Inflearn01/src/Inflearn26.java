import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inflearn26 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] numbers = new int[n];

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers[i] = scn.nextInt();
            int a = numbers[i];
            int reversed = 0;
            while (a > 0) {
                int b = a % 10;
                reversed = (reversed * 10) + b;
                a = a / 10;
            }
            if (isPrimeNumber(reversed)) {
                answer.add(reversed);
            }
        }
        for (int x : answer) {
            System.out.print(x + " ");
        }
    }

    public static boolean isPrimeNumber(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

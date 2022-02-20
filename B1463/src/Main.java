import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        int answer = 0;
        cal(a, answer);
        System.out.println(answer);
    }

    public static void cal(int a, int answer) {
        if (a == 1) {
            return;
        }
        if (a % 3 == 0) {
            a = a / 3;
            answer++;
        }
        if (a % 2 == 0) {
            a = a / 2;
            answer++;
        }
        cal(a - 1, answer+1);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int c = 0;
        int input = n;

        while (true) {
            n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
            c++;

            if (input == n) {
                break;
            }
        }
        System.out.println(c);

    }
}


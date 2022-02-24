import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int prize = 0;

        scn.close();
        if (a == b && b == c) {
            prize = 10000 + a * 1000;
        } else if (a == b || a == c) {
            prize = 1000 + a * 100;
        } else if (b == c){
            prize = 1000 + b * 100;
        } else {
            prize = Math.max(a, Math.max(b, c)) * 100;
        }

        System.out.println(prize);
    }
}

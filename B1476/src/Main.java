import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int e, s, m ;
        e = s = m = 1;
        int E = scn.nextInt();
        int S = scn.nextInt();
        int M = scn.nextInt();

        int year = 1;

        while (true) {
            if (e == E & s == S & m == M) {
                break;
            }
            e++;
            s++;
            m++;
            if (e == 16) {
                e = 1;
            }
            if (s == 29) {
                s = 1;
            }
            if (m == 20) {
                m = 1;
            }
            year++;
        }
        System.out.println(year);
    }
}

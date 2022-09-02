import java.util.Scanner;

public class Inflearn04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int testcase = scn.nextInt();
        String[] arr = new String[testcase];
        for (int i = 0; i < testcase; i++) {
            arr[i] = scn.next();
        }
        for (String s : arr) {
            String s1 = new StringBuilder(s).reverse().toString();
            System.out.println(s1);
        }
    }
}

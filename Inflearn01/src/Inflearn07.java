import java.util.Scanner;

public class Inflearn07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next().toLowerCase();

        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed)) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}

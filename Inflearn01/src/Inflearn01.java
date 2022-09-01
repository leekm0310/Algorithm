import java.util.Scanner;

public class Inflearn01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.next().toUpperCase();
        char a = scn.next().charAt(0);
        a = Character.toUpperCase(a);

        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                result++;
            }
        }
        System.out.println(result);
    }
}

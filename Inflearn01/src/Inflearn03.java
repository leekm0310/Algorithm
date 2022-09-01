import java.util.Scanner;

public class Inflearn03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String[] split = str.split(" ");
        int a = Integer.MIN_VALUE;
        String result = "";

        for (String s : split) {
            int length = s.length();
            if (length > a) {
                a = length;
                result = s;
            }
        }
        System.out.println(result);
    }
}

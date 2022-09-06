import java.util.Scanner;

public class Inflearn09 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        String s = str.toLowerCase().replaceAll("[^0-9]", "");

        System.out.println(Integer.valueOf(s));
    }
}

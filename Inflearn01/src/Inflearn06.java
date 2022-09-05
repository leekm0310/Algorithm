import java.util.Scanner;

public class Inflearn06 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        String answer ="";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer = answer + str.charAt(i);
            }
        }
        System.out.println(answer);
    }
}

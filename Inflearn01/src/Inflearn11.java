import java.util.Scanner;

public class Inflearn11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        str = str + " ";
        int count = 1;
        String answer = str.substring(0, 1);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else if (str.charAt(i) != str.charAt(i - 1)) {
                if (count > 1) {
                    answer += String.valueOf(count);
                }
                answer += str.charAt(i);
                count = 1;
            }
        }
        System.out.println(answer);
    }
}

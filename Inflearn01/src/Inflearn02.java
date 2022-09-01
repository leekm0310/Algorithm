import java.util.Scanner;

public class Inflearn02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.next();
        String answer ="";


        for (int i = 0; i < str.length(); i++) {
            //대문자일때
            if (Character.isUpperCase(str.charAt(i))) {
                answer += Character.toLowerCase(str.charAt(i));
            }
            //소문자일때
            else {
                answer += Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(answer);
    }
}

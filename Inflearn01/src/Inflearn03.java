import java.util.Scanner;

public class Inflearn03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String[] split = str.split(" ");
        int answer = 0;

        for (int i = 0; i < split.length; i++) {
            if (split[answer].length() < split[i].length()) {
                answer = i;
            }
        }
        System.out.println(split[answer]);
    }
}

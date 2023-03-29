import java.util.Scanner;

public class B1212 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String n = scn.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n.length(); i++) {
            int a = n.charAt(i) - '0';
            String binary = Integer.toBinaryString(a);
            if (i != 0 && binary.length() == 1) {
                sb.append("00");
                sb.append(binary);
            } else if (i != 0 && binary.length() == 2) {
                sb.append("0");
                sb.append(binary);
            } else {
                sb.append(Integer.toBinaryString(a));
            }
        }
        System.out.println(sb);
    }
}

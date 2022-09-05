import java.util.Scanner;

public class Inflearn08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String line = scn.nextLine().toLowerCase();
        String original = line.replaceAll("[^a-z]", "");
        String reversed = new StringBuilder(original).reverse().toString();


        if (original.equals(reversed)) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}

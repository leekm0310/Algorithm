import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = (scn.nextInt()) * (scn.nextInt()) * (scn.nextInt());
        scn.close();
        String s = Integer.toString(a);

        int[] arr = new int[10];

        for (int i = 0; i < s.length(); i++) {
            arr[(s.charAt(i))-48]++;
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }
}

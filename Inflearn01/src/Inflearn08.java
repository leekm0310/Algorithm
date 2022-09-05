import java.util.Scanner;
//found7 time study Yduts emit 7Dnuof
public class Inflearn08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String line = scn.nextLine().toLowerCase();
        char[] arr = line.toCharArray();

        for (int i = 0; i < arr.length / 2; i++) {
            if (Character.isAlphabetic(arr[i]) && (arr[i] != arr[arr.length-i-1])) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}

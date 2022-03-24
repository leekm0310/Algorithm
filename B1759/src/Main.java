import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int l;
    static int c;
    static char[] arr;
    static boolean[] checked;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        l = scn.nextInt();
        c = scn.nextInt();
        arr = new char[c];
        checked = new boolean[c];
        for (int i = 0; i < c; i++) {
            arr[i] = scn.next().charAt(0);
        }
        Arrays.sort(arr);
        createPassword(0, 0);

    }

    public static void createPassword(int start, int cnt) {
        if (cnt == l) {
            int vowel = 0;
            int consonant = 0;
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < c; i++) {
                if (checked[i]) {
                    if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                        vowel++;
                    } else {
                        consonant++;
                    }
                    sb.append(arr[i]);
                }
            }
            if (vowel >= 1 && consonant >= 2) {
                System.out.println(sb);
            }
        } else {
            for (int i = start; i < c; i ++) {
                checked[i] = true;
                createPassword(i+1, cnt+1);
                checked[i] = false;
            }
        }
    }
}

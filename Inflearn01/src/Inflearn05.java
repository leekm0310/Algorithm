import java.util.Scanner;

public class Inflearn05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        char[] split = str.toCharArray();
        int left = 0;
        int right = split.length-1;


        while (left < right) {
            if (!Character.isAlphabetic(split[left])) {
                left++;
            } else if (!Character.isAlphabetic(split[right])) {
                right--;
            } else {
                char tem = split[left];
                split[left] = split[right];
                split[right] = tem;
                left++;
                right--;
            }
        }
        System.out.println(String.valueOf(split));
    }
}

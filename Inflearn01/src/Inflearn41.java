import java.util.HashMap;
import java.util.Scanner;

public class Inflearn41 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        char[] chars = scn.next().toCharArray();
        char answer =' ';

        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : chars) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        System.out.println(answer);

    }
}

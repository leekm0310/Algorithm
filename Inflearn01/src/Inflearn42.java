import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inflearn42 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        char[] first = scn.next().toCharArray();
        char[] second = scn.next().toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        String answer = "YES";

        for (int i = 0; i < first.length; i++) {
            map.put(first[i], map.getOrDefault(first[i], 0) +1);
        }
        for (int i = 0; i < second.length; i++) {
            if (!map.containsKey(second[i]) || map.get(second[i]) == 0) {
                answer = "NO";
            }
            map.put(second[i], map.getOrDefault(second[i], 0) - 1);
        }
        System.out.println(answer);
    }
}

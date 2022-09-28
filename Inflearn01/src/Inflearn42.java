import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inflearn42 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        char[] first = scn.next().toCharArray();
        char[] second = scn.next().toCharArray();

        Map<Character, Integer> firstMap = new HashMap<>();

        for (int i = 0; i < first.length; i++) {
            firstMap.put(first[i], firstMap.getOrDefault(first[i], 0) +1);
            firstMap.put(second[i], firstMap.getOrDefault(second[i], 0) - 1);
        }

        String answer = "YES";
        for (int i = 0; i < firstMap.size(); i++) {
            if (firstMap.get(first[i]) < 0) {
                answer = "NO";
            }
        }
        System.out.println(answer);
    }
}

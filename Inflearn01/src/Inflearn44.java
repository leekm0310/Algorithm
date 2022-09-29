import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inflearn44 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String s = scn.next();
        String t = scn.next();

        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }

        int length = t.length() - 1;
        Map<Character, Integer> sMap = new HashMap<>();
        for (int i = 0; i < length; i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        int answer = 0;
        int lt = 0;
        for (int rt = length; rt < s.length(); rt++) {
            sMap.put(s.charAt(rt), sMap.getOrDefault(s.charAt(rt), 0) + 1);
            if (sMap.equals(tMap)) {
                answer++;
            }
            sMap.put(s.charAt(lt), sMap.get(s.charAt(lt)) - 1);
            if (sMap.get(s.charAt(lt)) == 0) {
                sMap.remove(s.charAt(lt));
            }
            lt++;
        }

        System.out.println(answer);
    }
}

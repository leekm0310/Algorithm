import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Leetcode3 {
    public static int lengthOfLongestSubString(String s) {
        int max = 0;
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c) && map.get(c) >= start) {
                max = Math.max(max, i - start);
                start = map.get(c) + 1;
            }
            map.put(c, i);
        }
        return Math.max(max, s.length() - start);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(lengthOfLongestSubString(s));
    }
}

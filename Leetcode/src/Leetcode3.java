import java.util.ArrayList;
import java.util.List;

public class Leetcode3 {
    public static int lengthOfLongestSubstring(String s) {
        List<Character> subs = new ArrayList<>();
        int length = 0;
        for (int right = 0; right < s.length(); right++) {
            if (subs.contains(s.charAt(right))) {
                int index = subs.indexOf(s.charAt(right));
                subs.remove(index);
                if (index > 0) {
                    subs.subList(0, index).clear();
                }
            }
            subs.add(s.charAt(right));
            length = Math.max(length, subs.size());
        }
        return length;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}

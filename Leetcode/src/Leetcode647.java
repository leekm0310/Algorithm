public class Leetcode647 {
    public int countSubstrings(String s) {
        int strLength = s.length();
        if (strLength < 2) {
            return 1;
        }

        int count = 0;

        for (int i = 0; i < strLength; i++) {
            int right = i;
            int left = i;
            while (left >= 0 && right < strLength && s.charAt(left) == s.charAt(right)) {
                count++;
                right += 1;
                left -= 1;
            }

            right = i + 1;
            left = i;
            while (left >= 0 && right < strLength && s.charAt(left) == s.charAt(right)) {
                count++;
                right += 1;
                left -= 1;
            }
        }
        return count;
    }
}

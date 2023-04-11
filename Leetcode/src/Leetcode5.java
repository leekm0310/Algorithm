public class Leetcode5 {
    public static String longestPalindrome(String s) {
        int strLength = s.length();

        if (strLength < 2) {
            return s;
        }

        String answer = "";
        int answerLength = 0;

        for (int i = 0; i < strLength; i++) {
            int right = i;
            int left = i;
            while (left >= 0 && right < strLength && s.charAt(right) == s.charAt(left)) {
                if ((right - left + 1) > answerLength) {
                    answer = s.substring(left, right + 1);
                    answerLength = right - left + 1;
                }
                left -= 1;
                right += 1;
            }

            left = i;
            right = i+1;
            while (left >= 0 && right < strLength && s.charAt(right) == s.charAt(left)) {
                if ((right - left + 1) > answerLength) {
                    answer = s.substring(left, right + 1);
                    answerLength = right - left + 1;
                }
                left -= 1;
                right += 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "baabdd";
        longestPalindrome(s);
    }
}

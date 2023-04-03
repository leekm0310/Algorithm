public class Leetcode125 {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int pointer = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(pointer)) {
                return false;
            }
            pointer--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
}

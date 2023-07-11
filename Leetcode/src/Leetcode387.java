public class Leetcode387 {
    public static int firstUniqChar(String s) {
        int idx = -1;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return s.indexOf(s);
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(firstUniqChar(s));
    }
}

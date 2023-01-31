public class Leetcode14 {
    public static String longestCommonPrefix(String[] strs) {
        String answer = "";
        if (strs.length == 0) {
            return answer;
        }
        answer = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String compared = strs[i];
            while (compared.indexOf(answer) != 0) {
                answer = answer.substring(0, answer.length() - 1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] a = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(a));

    }
}

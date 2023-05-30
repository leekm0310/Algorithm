public class Leetcode424 {
    public static int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int answer = 0;
        int max = 0;
        int i = 0;

        for (int j = 0; j < s.length(); j++) {
            int letter = s.charAt(j) - 'A';
            arr[letter]++;
            max = Math.max(max, arr[letter]);
            if (j - i + 1 - max > k) {
                arr[letter]--;
                i++;
            }
            answer = Math.max(answer, j - i + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "ABAB";
        System.out.println(characterReplacement(s, 2));

    }
}

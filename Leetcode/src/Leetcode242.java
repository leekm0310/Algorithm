import java.util.Arrays;

public class Leetcode242 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        String[] splitedS = s.split("");
        String[] splitedT = t.split("");
        Arrays.sort(splitedS);
        Arrays.sort(splitedT);
        for (int i = 0; i < splitedS.length; i++) {
            if (!splitedS[i].equals(splitedT[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}

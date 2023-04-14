import java.util.HashMap;
import java.util.Map;

public class Leetcode819 {
    public static String mostCommonWord(String paragraph, String[] banned) {
        String words = paragraph.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase();
        String removeSpaces = words.replaceAll("  ", " ");
        String[] arr = removeSpaces.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for(String str : arr) {
            map.put(str, map.getOrDefault(str, 0)+1);
        }

        for(String ban : banned) {
            map.remove(ban);
        }

        int max = 0;
        for(String word : map.keySet()) {
            max = Math.max(max, map.get(word));
        }

        for(String word : map.keySet()) {
            if(map.get(word) == max) {
                return word;
            }
        }
        return words.replace(" ","");
    }

    public static void main(String[] args) {
        String s = "Bob. hIt, baLl";
        String[] banned = {"bob", "hit"};
        mostCommonWord(s, banned);

    }
}

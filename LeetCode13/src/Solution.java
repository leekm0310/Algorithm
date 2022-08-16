import java.util.Map;

public class Solution {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = initMap();
        int result = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result = result - map.get(s.charAt(i));
            } else {
                result = result + map.get(s.charAt(i));
            }
        }
        return result + map.get(s.charAt(s.length() -1));
    }

    private static Map<Character, Integer> initMap() {
        return Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50,
                'C', 100, 'D', 500, 'M', 1000);
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }
}

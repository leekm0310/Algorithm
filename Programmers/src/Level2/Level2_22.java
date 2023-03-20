package Level2;

import java.util.HashMap;
import java.util.Map;

public class Level2_22 {
    public static int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();

        for (String[] clothe : clothes) {
            map.put(clothe[1], map.getOrDefault(clothe[1], 0) + 1);
        }

        for (Integer value : map.values()) {
            answer *= (value+1);
        }
        return answer - 1;
    }

    public static void main(String[] args) {
        String[][] arr = {{"yellow_hat", "headgear"}, {"yellow_hat1", "headgear"},
                {"blue_sunglasses", "eyewear"}};
        System.out.println(solution(arr));
    }
}

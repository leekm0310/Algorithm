package Level2;

import java.util.*;

public class Level2_10 {
    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i : tangerine) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }

        //가짓수만 세면 되니까 굳이 key로 정렬하지말고 value 정렬해도 될 것 같음.
        List<Integer> keys = new ArrayList<>(countMap.keySet());

        keys.sort((o1, o2) -> countMap.get(o2) - countMap.get(o1));

        for (int i = 0; i < keys.size(); i++) {
            if (k <= 0) {
                return answer;
            }
            k = k - countMap.get(keys.get(i));
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 2;
        int[] arr = {1, 1, 1, 1, 2, 2, 2, 3};
        solution(n, arr);
    }
}

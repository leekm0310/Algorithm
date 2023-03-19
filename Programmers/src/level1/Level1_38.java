package level1;

import java.util.HashMap;
import java.util.Map;

public class Level1_38 {
    public static int solution(int[] nums) {
        int answer = 0;
        int pokemon = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], 1);
        }

        answer = Math.min(map.size(), pokemon);

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,2};
        System.out.println(solution(nums));
    }
}

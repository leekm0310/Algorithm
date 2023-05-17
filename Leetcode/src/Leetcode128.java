import java.util.HashSet;

public class Leetcode128 {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();
        int answer = 1;
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {
            if (!set.contains(num-1)){
                int count = 1;
                while(set.contains(num+1)) {
                    num++;
                    count++;
                }
                answer = Math.max(count, answer);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 3, 1, 2};
        System.out.println(longestConsecutive(nums));
    }
}

public class LeetCode1929 {
    public static int[] getConcatenation(int[] nums) {
        int[] answer = new int[nums.length * 2];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = nums[i % nums.length];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        getConcatenation(nums);
    }
}

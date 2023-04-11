public class Leetcode198 {
    public static int rob(int[] nums) {
        int rob1 = 0;
        int rob2 = 0;

        for (int i = 0; i < nums.length; i++) {
            int temp = Math.max(rob1 + nums[i], rob2);
            rob1 = rob2;
            rob2 = temp;
        }

        return rob2;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 3, 1};
        rob(arr);
    }
}

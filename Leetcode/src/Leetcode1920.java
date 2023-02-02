public class Leetcode1920 {
    public static int[] buildArray(int[] nums) {
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            answer[i] = nums[nums[i]];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] n = {0, 2, 1, 5, 3, 4};
        int[] ints = buildArray(n);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}

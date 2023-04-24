public class Leetcode238 {
    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        int right = 1;
        int left = 1;

        for(int i = 0; i < nums.length; i++) {
            answer[i] = left;
            left *= nums[i];
        }

        for(int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= right;
            right *= nums[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        productExceptSelf(nums);
    }
}

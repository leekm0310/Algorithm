public class Leetcode714 {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;


        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] > target) {
                right = middle - 1;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0};
        System.out.println(search(arr, 0));
    }
}

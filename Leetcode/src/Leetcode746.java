public class Leetcode746 {
    public static int minCostClimbingStairs(int[] cost) {
        int[] arr = new int[cost.length + 1];
        arr[cost.length] = 0;
        arr[cost.length - 1] = cost[cost.length - 1];

        for (int i = cost.length - 2; i >= 0; i--) {
            if (arr[i + 1] < arr[i + 2]) {
                arr[i] = arr[i + 1] + cost[i];
            } else {
                arr[i] = arr[i + 2] + cost[i];
            }
        }
        return Math.min(arr[0], arr[1]);
    }

    public static void main(String[] args) {
        int[] a = {1,100,1,1,1,100,1,1,100,1};
        minCostClimbingStairs(a);
    }
}

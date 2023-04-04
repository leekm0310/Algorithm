public class Leetcode121 {
    public static int maxProfit(int[] prices) {
        int answer = 0;
        int left = 0;
        int right = 1;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                answer = Math.max(answer, prices[right] - prices[left]);
                right++;
            } else {
                left = right;
                right++;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(maxProfit(arr));
    }
}

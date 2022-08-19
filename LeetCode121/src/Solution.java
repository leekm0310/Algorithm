public class Solution {
    public static int maxProfit(int[] prices) {
        int b = 0;

        for (int i = 0; i < prices.length; i++) {
            int a = prices[i];
            for (int j = i+1; j < prices.length; j++){
                if (a < prices[j] && b < (prices[j] - a)) {
                    b = prices[j] - a;
                }
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }
}

public class Leetcode875 {
    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 1;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {
            int middle = (left + right) / 2;
            int hours = 0;

            for (int pile : piles) {
                hours += Math.ceil((double) pile / middle);
            }

            if (hours <= h) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return right;
    }
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 5;
        System.out.println(minEatingSpeed(piles, h));

    }
}

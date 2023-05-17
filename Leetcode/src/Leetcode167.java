public class Leetcode167 {
    public static int[] twoSum(int[] numbers, int target) {

        int p = 0;
        int p2 = numbers.length - 1;
        int a, b;

        while (p < p2) {
            a = numbers[p];
            b = numbers[p2];

            if (a + b == target) {
                break;
            }
            if (a + b > target) {
                p++;
                continue;
            }
            p2--;
        }

        return new int[] {p + 1, p2 + 1};
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 11};
        int target = 9;
        twoSum(arr, target);

    }
}

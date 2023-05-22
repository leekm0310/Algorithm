public class Leetcode11 {
    public static int maxArea(int[] height) {
        int answer = 0;
        int x = 0;
        int y = height.length - 1;

        while (x < y) {
            int length = y - x;
            int area = length * Math.min(height[x], height[y]);
            answer = Math.max(area, answer);

            if (height[x] < height[y]) {
                x++;
            } else {
                y--;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }
}

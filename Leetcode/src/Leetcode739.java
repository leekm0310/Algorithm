import java.util.Stack;

public class Leetcode739 {
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int p = stack.pop();
                answer[p] = i - p;
            }
            stack.add(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        dailyTemperatures(arr);
    }
}

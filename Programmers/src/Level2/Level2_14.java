package Level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Level2_14 {
    public static List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> a = new ArrayList<>();

        int[] days = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            if ((100 - progresses[i]) % speeds[i] != 0) {
                days[i] = (100 - progresses[i]) / speeds[i] + 1;
            } else {
                days[i] = (100 - progresses[i]) / speeds[i];
            }
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = days.length - 1 ; i >= 0; i--) {
            stack.push(days[i]);
        }

        while (!stack.isEmpty()) {
            int count = 0;
            Integer pop = stack.pop();
            count++;
            while (!stack.isEmpty() && stack.peek() <= pop) {
                stack.pop();
                count++;
            }
            a.add(count);
        }

        return a;
    }

    public static void main(String[] args) {
        int[] arr = {55, 60, 65};
        int[] speed = {5, 10, 7};
        List<Integer> solution = solution(arr, speed);
        for (Integer integer : solution) {
            System.out.println(integer);
        }
    }
}

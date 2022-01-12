import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        //투포인터 삽질중
        int[] data = {3, 2, 4};
        int tg = 6;
        int[] result = new int[2];
        int start = 0;
        int sum = 0;
        int end = 0;
        while (start < data.length) {
            if (sum > tg || end == data.length) {
                sum -= data[start];
                start++;
            } else {
                sum += data[end];
                end++;
            }
            if (sum == tg) {
                result[0] = start;
                result[1] = end;
            }
        }
        System.out.println(Arrays.toString(result));
    }


    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int as = nums[i] + nums[j];
                if (as == target) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return answer;
    }
}

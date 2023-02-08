import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice6 {
    public static List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for (int i = 0; i < arr.length; i++) {
            if (tmp[i] != arr[i]) {
                answer.add(i + 1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {120, 125, 152, 130, 132, 135, 145, 128, 157};
        solution(arr);
    }
}

import java.util.Arrays;

public class Practice5 {
    //hashmap 은 O(n), 정렬은 O(nlogn) 하지만 정렬로 풀어보자
    public static String solution(int[] arr) {
        String answer = "U";
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return "D";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7, 4, 2, 1};
        System.out.println(solution(arr));
    }
}

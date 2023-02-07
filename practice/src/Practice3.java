public class Practice3 {
    public static int[] solution(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {11, 7, 5, 6, 10, 9, 2};
        solution(arr);
    }
}

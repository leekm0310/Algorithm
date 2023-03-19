package Level2;

import java.util.Arrays;

public class Level2_21 {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) {
                return false;

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] arr = {"12", "123", "1235", "567", "88"};
        System.out.println(solution(arr));
    }
}

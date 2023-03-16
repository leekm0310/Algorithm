package Level2;

import java.util.*;

public class Level2_18 {
    public static int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);
        int index = 0;
        for (int i = people.length - 1; i >= index; i--) {
            if (people[i] + people[index] <= limit) {
                index++;
                answer++;
            } else {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {70, 50, 80, 50, 20};
        solution(arr, 100);
    }
}

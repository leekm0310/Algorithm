package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Level1_22 {
    public static List<Integer> solution(int[] array, int[][] commands) {
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();
        for (int i = 0; i < commands.length; i++) {
            for (int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++) {
                a1.add(array[j]);
            }
            Collections.sort(a1);
            a2.add(a1.get(commands[i][2] - 1));
            a1.clear();
        }

        return a2;
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 2, 6, 3, 7, 4};
        int[][] b = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        List<Integer> solution = solution(a, b);
        for (int i : solution) {
            System.out.println(i);
        }
    }


}

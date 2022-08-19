import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < rowIndex+1; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i-1).get(j));
                }
            }
            triangle.add(row);
        }
        return triangle.get(rowIndex);
    }

    public static void main(String[] args) {
        List<Integer> row = getRow(3);
        for (Integer i : row) {
            System.out.println(i);
        }
    }
}

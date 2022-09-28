import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inflearn43 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= n - k; i++) {
            for (int j = i; j < i + k; j++) {
                map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            }
            System.out.print(map.size() + " ");
            map.clear();
        }

    }
}

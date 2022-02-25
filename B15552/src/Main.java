import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s.split(" ")[0]);
        int x = Integer.parseInt(s.split(" ")[1]);
        String[] ss = br.readLine().split(" ");
        int[] a = Arrays.stream(ss).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < n; i++){
            if (a[i] < x) {
                System.out.print(a[i] +" ");
            }
        }
    }
}

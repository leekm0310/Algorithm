import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.valueOf(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            arr[i] = Integer.valueOf(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int x = Integer.valueOf(st.nextToken());

        int count = 0;
        int start = 0;
        int end = n - 1;

        Arrays.sort(arr);
        while(start < end){
            int sum = arr[start] + arr[end];
            if (sum == x) {
                end--;
                start++;
                count++;
            } else if (sum > x) {
                end--;
            } else {
                start++;
            }
        }
        System.out.println(count);



    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine().split(" ")[0]);
//        int x = Integer.parseInt(br.readLine().split(" ")[1]);
        String s = br.readLine();
        int a = Integer.parseInt(s.split(" ")[0]);
        int b = Integer.parseInt(s.split(" ")[1]);
        System.out.println(a);
        System.out.println(b);

    }
}

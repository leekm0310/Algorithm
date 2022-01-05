import java.util.Scanner;

public class b1009 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int testcases = scn.nextInt();
        for (int i = 0; i < testcases; i++) {
            //1의 숫자만 필요하다고 생각해서 a,b도 10으로 나눴는데 틀림
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = 1;
            //answer[i] = Math.pow(a,b) % 10.0; 뻘짓의 흔적
            for (int j = 0; j < b; j++){
                c = a * c % 10;
            }
            if (c == 0) {
                c = 10;
            }
            System.out.println(c);
        }
        scn.close();
    }
}

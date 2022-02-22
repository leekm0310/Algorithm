//Memoization
import java.util.Scanner;

public class Main {
    static int dp[][];
    static int value[][];

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();

        for (int i = 0; i < t; i++){
            int n = scn.nextInt();

            value = new int [2][n+1];
            dp = new int[2][n+1];
            //애초에 입력을 받을때 0번 인덱스를 쓰지않고 1번부터 쓴다.

            for (int j = 0; j < 2; j++){
                for (int k = 1; k < n; k++){
                    value[j][k] = scn.nextInt();
                }
            }
            dp[0][1] = value[0][1];
            dp[1][1] = value[1][1];

            //n이 1이라면 Math.max(dp[0][1], dp[1][1]);
            //dp[0][2] 첫번째 행의 두번째 열을 선택했을때 최대값 40
            //dp[1][2] 두번째 행의 두번째 열을 선택했을때 최대값 100
            //dp[0][3] 첫번째 행의 세번째 열을 선택했을때 최대값 200
            //dp[1][3] 두번째 행의 세번째 열을 선택했을때 최대값 110일것 같지만 아님

            for (int k = 2; k < n; k++){
                dp[0][k] = Math.max(dp[1][k-1], dp[1][k-2])+value[0][k];
                dp[1][k] = Math.max(dp[0][k-1], dp[0][k-2])+value[1][k];
            }
            System.out.println(Math.max(dp[0][n], dp[1][n]));
        }
    }
}

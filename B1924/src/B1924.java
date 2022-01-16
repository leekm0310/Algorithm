import java.util.Scanner;

//1일 1알고리즘
public class B1924 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int d = scn.nextInt();

        int[] day = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] answers = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};


        for (int i = 0; i < m-1; i++){
            d = d + day[i];
        }

        System.out.println(answers[d%7]);
    }
}

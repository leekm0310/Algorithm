import java.util.Scanner;

public class Inflearn22 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] students = new int[n];
        for (int i = 0; i < n; i++) {
            students[i] = scn.nextInt();
        }
        int answer = 0;
        int max = 0;
        for (int i = 0; i < students.length; i++) {
           if (students[i] > max) {
                answer++;
                max = students[i];
            }
        }
        System.out.println(answer);
    }
}

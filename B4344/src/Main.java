import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int cases = scn.nextInt();

        int[] arr;

        for (int i = 0; i < cases; i++) {
            int students = scn.nextInt();
            arr = new int[students];
            double total = 0;

            for (int j = 0; j < arr.length; j++) {
                int put = scn.nextInt();
                arr[j] = put;
                total = total + put;
            }

            double average = (total / students);
            double count = 0;
            for (int j = 0; j < students; j++) {
                if (arr[j] > average) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (count/students)*100);

        }
    }
}

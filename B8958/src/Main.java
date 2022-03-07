import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String[] arr = new String[scn.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.next();
        }
        scn.close();


        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int sum = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') {
                    count++;
                } else {
                    count = 0;
                }
                sum = sum + count;
            }
            System.out.println(sum);
        }
    }
}

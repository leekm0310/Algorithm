import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int target = scn.nextInt();

        for (int i = 0; i < target; i++) {
            for (int j = 1; j < target-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < target; i++){
            for (int k = 0; k < i; k++){
                System.out.print(" ");
            }
            for (int j = target-i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

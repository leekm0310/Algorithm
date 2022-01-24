import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int target = scn.nextInt();

        for (int i = 1; i <= target; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (target - i); k++){
                System.out.print(" ");
            }
            for (int a = 1; a <= i; a++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = target - 1; i > 0; i--){
            for (int j = i; j > 0; j--){
                System.out.print("*");
            }
            for (int k = 1; k<= 2 * (target - i); k++){
                System.out.print(" ");
            }
            for (int a = 1; a<= i; a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

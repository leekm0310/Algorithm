import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kg = scanner.nextInt();
        scanner.close();
        int x;
        int y;
        int answer = 0;

       if (kg % 5 == 0) {
           x = kg / 5;
           answer = x;
       } else if ((kg % 5) % 3 == 0) {
           x = kg / 5;
           y = (kg % 5) / 3;
           answer = x + y;
       } else if ((kg % 5) % 3 != 0 && kg % 3 == 0) {
           y = kg / 3;
           answer = y;
       } else if ((kg % 5) % 3 != 0) {
           answer = -1;
       }
        System.out.println(answer);
    }
}

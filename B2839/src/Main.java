import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kg = scanner.nextInt();
        scanner.close();

       if (kg % 5 == 0) {
           System.out.println(kg / 5);
       } else if ((kg % 5) % 3 == 0) {
           System.out.println((kg / 5) + ((kg % 5) / 3));
       } else if ((kg % 5) % 3 != 0 && kg % 3 == 0) {
           System.out.println(kg / 3);
       } else if ((kg % 5) % 3 != 0) {
           System.out.println(-1);
       }
    }
}

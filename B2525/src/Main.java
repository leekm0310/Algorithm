import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int hour = scn.nextInt();
        int min = scn.nextInt();
        int add = scn.nextInt();

        if (min + add >= 60) {
            hour = hour + (min + add) / 60;
            min = (min + add) % 60;
        } else {
            min = min + add;
        }

        if (hour >= 24) {
            hour = hour - 24;
        }

        System.out.println(hour + " " + min);
    }
}

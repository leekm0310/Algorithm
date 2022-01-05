import java.util.Scanner;

public class B1076 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] color = {"black", "brown", "red", "orange",
        "yellow", "green", "blue", "violet", "grey", "white"};

        String color1 = scn.nextLine();
        String color2 = scn.nextLine();
        String color3 = scn.nextLine();
        long c1 = 0;
        long c2 = 0;
        long c3 = 0;
        long answer = 0;
        for (int i = 0; i < color.length; i++){
            if (color[i].equals(color1)){
                c1 = i * 10;
            }
            if (color[i].equals(color2)){
                c2 = i;
            }
            if (color[i].equals(color3)){
                c3 = (int)Math.pow(10, i);
            }
        }
        scn.close();
        answer = (c1 + c2) * c3;
        System.out.println(answer);

    }
}

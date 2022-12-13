import java.util.ArrayList;
import java.util.Scanner;

class Point814 {
    public int x, y;

    public Point814(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Inflearn814 {
    static int n;
    static int m;
    static int length;
    static int answer = Integer.MAX_VALUE;
    static int[] combination;
    static ArrayList<Point814> pizza, house;

    public void DFS(int L, int s) {
        if (L == m) {
            int sum = 0;
            for (Point814 h : house) {
                int dis = Integer.MAX_VALUE;
                for (int i : combination) {
                    dis = Math.min(dis, Math.abs(h.x - pizza.get(i).x) + Math.abs(h.y - pizza.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = s; i < length; i++) {
                combination[L] = i;
                DFS(L + 1, i + 1);
            }
        }

    }

    public static void main(String[] args) {
        Inflearn814 inflearn814 = new Inflearn814();
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        m = scn.nextInt();
        pizza = new ArrayList<>();
        house = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = scn.nextInt();
                if (tmp == 1) {
                    house.add(new Point814(i, j));
                } else if (tmp == 2) {
                    pizza.add(new Point814(i, j));
                }
            }
        }
        length = pizza.size();
        combination = new int[m];
        inflearn814.DFS(0, 0);
        System.out.println(answer);
    }
}

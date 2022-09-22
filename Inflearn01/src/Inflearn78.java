import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Inflearn78 {
    int[] distance = {1, -1, 5};
    int[] checked;
    Queue<Integer> q = new LinkedList<>();

    public int BFS(int location, int goal) {
        checked = new int[10001];
        checked[location] = 1;
        q.offer(location);
        int level = 0;

        while (!q.isEmpty()) {
            int len = q.size();

            for (int i = 0; i < len; i++) {
                int x = q.poll();

                for (int j = 0; j < distance.length; j++) {
                    int nx = x + distance[j];
                    if (nx == goal) {
                        return level+1;
                    }
                    if (nx >= 1 && nx <= 10000 && checked[nx] == 0) {
                        checked[nx] = 1;
                        q.offer(nx);
                    }
                }
            }
            level++;
        }
        return 0;
    }


    public static void main(String[] args) {
        Inflearn78 M = new Inflearn78();
        Scanner scn = new Scanner(System.in);
        int location = scn.nextInt();
        int goal = scn.nextInt();
        System.out.println(M.BFS(location, goal));


    }
}

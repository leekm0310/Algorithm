import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Block implements Comparable<Block> {
    public int width, height, weigh;

    public Block(int width, int height, int weigh) {
        this.width = width;
        this.height = height;
        this.weigh = weigh;
    }

    @Override
    public int compareTo(Block o) {
        return o.width - this.width;
    }
}

public class Inflearn1004 {

    static int[] dy;
    static int solution(List<Block> list) {
        dy = new int[list.size()];
        int answer = 0;

        Collections.sort(list);

        dy[0] = list.get(0).height;
        answer = dy[0];

        for (int i = 1; i < list.size(); i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (list.get(j).weigh > list.get(i).weigh && dy[j] > max) {
                    max = dy[j];
                }
            }
            dy[i] = max + list.get(i).height;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        List<Block> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();
            list.add(new Block(a, b, c));
        }
        System.out.println(solution(list));
    }
}

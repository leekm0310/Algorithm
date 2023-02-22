import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Time implements Comparable<Time> {

    public int time;
    public char state;

    public Time(int time, char state) {
        this.time = time;
        this.state = state;
    }


    @Override
    public int compareTo(Time o) {
        if (this.time == o.time) {
            return this.state - o.state;
        } else {
            return this.time - o.time;
        }
    }
}

public class Inflearn93 {
    public static int solution(List<Time> list) {
        int answer = 0;
        Collections.sort(list);

        int count = 0;
        for (Time t : list) {
            if (t.state == 's') {
                count++;
            } else {
                count--;
            }
            answer = Math.max(answer, count);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        List<Time> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Time(scn.nextInt(), 's'));
            list.add(new Time(scn.nextInt(), 'e'));
        }
        System.out.println(solution(list));
    }
}

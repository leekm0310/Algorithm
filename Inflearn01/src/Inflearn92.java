import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Meeting implements Comparable<Meeting>{
    public int startTime;
    public int finishTime;

    public Meeting(int startTime, int finishTime) {
        this.startTime = startTime;
        this.finishTime = finishTime;
    }

    @Override
    public int compareTo(Meeting o) {
        if (this.finishTime == o.finishTime) {
            return this.startTime - o.startTime;
        }
        return this.finishTime - o.finishTime;
    }
}

public class Inflearn92 {

    public static int solution(List<Meeting> list) {
        int count = 0;
        Collections.sort(list);
        int finish = 0;
        for (Meeting meeting : list) {
            if (meeting.startTime >= finish) {
                count++;
                finish = meeting.finishTime;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        List<Meeting> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Meeting(scn.nextInt(), scn.nextInt()));
        }

        System.out.println(solution(list));
    }
}

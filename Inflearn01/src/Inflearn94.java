import java.util.*;

class Lecture implements Comparable<Lecture>{
    public int money;
    public int day;

    public Lecture(int money, int day) {
        this.money = money;
        this.day = day;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.day - this.day;
    }
}


public class Inflearn94 {
    public static int solution(List<Lecture> list, int max) {
        int answer = 0;
        Collections.sort(list);
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        int j = 0;
        for (int i = max; i >= 1; i--) {
            for ( ; j < list.size(); j++) {
                if (list.get(j).day < i) {
                    break;
                } else {
                    pQ.offer(list.get(j).money);
                }
            }
            if (!pQ.isEmpty()) {
                answer += pQ.poll();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        List<Lecture> list = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int m = scn.nextInt();
            int d = scn.nextInt();
            list.add(new Lecture(m, d));
            max = Math.max(max, d);
        }
        System.out.println(solution(list, max));

    }
}

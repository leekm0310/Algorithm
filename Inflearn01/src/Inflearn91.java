import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Candidate implements Comparable<Candidate>{
    public int height;
    public int weight;

    public Candidate(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Candidate o) {
        return o.height - this.height;
    }
}

public class Inflearn91 {
    public static int solution(List<Candidate> arr) {
        int answer = 0;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for (Candidate candidate : arr) {
            if (candidate.weight > max) {
                max = candidate.weight;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        List<Candidate> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Candidate(scn.nextInt(), scn.nextInt()));
        }
        System.out.println(solution(arr));
    }
}

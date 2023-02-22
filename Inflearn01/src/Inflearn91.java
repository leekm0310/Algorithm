import java.util.Scanner;

class Candidate {
    public int height;
    public int weight;

    public Candidate(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }
}

public class Inflearn91 {
    public static int solution(Candidate[] arr) {
        int answer = arr.length;
        for (int i = 0; i < arr.length; i++) {
            Candidate a = arr[i];
            for (int j = 0; j < arr.length; j++) {
                Candidate b = arr[j];
                if (b.height > a.height && b.weight > a.weight) {
                    answer--;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Candidate[] arr = new Candidate[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Candidate(scn.nextInt(), scn.nextInt());
        }
        System.out.println(solution(arr));
    }
}

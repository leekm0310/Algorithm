import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        int[] answers = {1, 2, 3, 4, 5};
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = {0, 0, 0};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % 5]) {
                score[0]++;
            }
            if (answers[i] == b[i % 8]) {
                score[1]++;
            }
            if (answers[i] == c[i % 10]) {
                score[2]++;
            }
        }

        int max = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
        }

        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (score[i] == max) {
                answer.add(i + 1);
            }
        }
    }
}
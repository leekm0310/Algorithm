package Level2;

public class Level2_19 {
    public static String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();

        char[] numbers = number.toCharArray();
        int length = numbers.length - k;

        int index = 0;
        for (int i = 0; i < length; i++) {
            char max = '0';
            for (int j = index; j <= i + k; j++) {
                if (numbers[j] > max) {
                    max = numbers[j];
                    index = j + 1;
                }
            }
            answer.append(max);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("4177252841", 4));
    }
}

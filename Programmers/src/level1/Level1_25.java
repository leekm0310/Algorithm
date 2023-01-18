package level1;

public class Level1_25 {
    public static String solution(int a, int b) {
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int count = 0;
        for (int i = 0; i < a - 1; i++) {
            count += days[i];
        }
        count += (b - 1);
        count %= 7;

        return day[count];
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 24));
    }
}

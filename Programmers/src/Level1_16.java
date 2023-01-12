public class Level1_16 {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total = 0;
        for (int i = 0; i <= count; i++) {
            total += price * i;
        }
        if (money - total > 0) {
            return 0;
        } else {
            answer *= (money - total);
        }
        return answer;
    }

    public static void main(String[] args) {
    }
}

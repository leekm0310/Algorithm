package Level2;

public class Level2_12 {
    public static int solution(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }

        int gcd = getGcd(arr[0], arr[1]);
        int lcm = (arr[0] * arr[1]) / gcd;

        for (int i = 2; i < arr.length; i++) {
            gcd = getGcd(lcm, arr[i]);
            lcm = (lcm * arr[i]) / gcd;
        }

        return lcm;
    }

    public static int getGcd(int a, int b) {
        while (b != 0) {
            int r = a % b;

            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(solution(arr));
    }
}

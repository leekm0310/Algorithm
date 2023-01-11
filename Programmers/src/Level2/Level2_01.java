package Level2;

public class Level2_01 {
    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] split = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < split.length; i++) {
            int t = Integer.valueOf(split[i]);
            if (t > max) {
                max = t;
            }
            if (t < min) {
                min = t;
            }
        }
        sb.append(min);
        sb.append(" ");
        sb.append(max);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("-1 -1"));
    }
}

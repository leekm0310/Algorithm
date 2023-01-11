public class Level1_09 {
    public static int solution(int[] numbers) {
        int answer = 0;
        String num = "0123456789";
        for (int i : numbers) {
            if (num.contains(String.valueOf(i))) {
                num = num.replace(String.valueOf(i), "");
            }
        }
        String[] split = num.split("");
        for (String s : split) {
            answer += Integer.valueOf(s);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6,7,0};
        System.out.println(solution(a));
    }
}

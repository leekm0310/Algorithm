package level1;

public class Level1_30 {
    public static int solution(String s) {
        String[] nums = {"zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < nums.length; i++) {
            if (s.contains(nums[i])) {
                s = s.replace(nums[i], String.valueOf(i));
            }
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        System.out.println(solution("2three45sixseven"));
    }
}

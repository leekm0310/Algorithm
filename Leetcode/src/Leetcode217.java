import java.util.HashSet;

public class Leetcode217 {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> check = new HashSet<>();
        for (int num : nums) {
            if (check.contains(num)) {
                return true;
            }
            check.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(arr));
    }
}

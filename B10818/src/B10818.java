import java.util.Arrays;
import java.util.Scanner;

public class B10818 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int[] nums = new int[a];

        for (int i =0; i < a; i++){
            nums[i] = scn.nextInt();
        }
        Arrays.sort(nums);
        System.out.println(nums[0]+" " +nums[a-1]);
    }
}
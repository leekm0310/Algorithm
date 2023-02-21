package level1;

import java.util.ArrayList;
import java.util.List;

public class Level1_32 {
    public static int solution(String dartResult) {
        int answer = 0;
        String[] split = dartResult.split("[A-Z]|\\*|#");
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals("")) {
                nums.add(Integer.parseInt(split[i]));
            }
        }

        List<String> options = new ArrayList<>();
        String s = dartResult.replaceAll("[0-9]", "");
        String[] split1 = s.split("");
        for (int i = 0; i < split1.length; i++) {
            if (!split1[i].equals("")) {
                options.add(split1[i]);
            }
        }

        int round = 0;

        for (int i = 0; i < options.size(); i++) {
            if (options.get(i).equals("D")) {
                nums.set(round, (int) Math.pow(nums.get(round), 2));
                round++;
            } else if (options.get(i).equals("T")) {
                nums.set(round, (int) Math.pow(nums.get(round), 3));
                round++;
            } else if (options.get(i).equals("S")) {
                round++;
            } else if (options.get(i).equals("*")) {
                if (i == 1) {
                    nums.set(0, nums.get(0) * 2);
                } else {
                    nums.set(round - 1, nums.get(round - 1) * 2);
                    nums.set(round - 2, nums.get(round - 2) * 2);
                }
            } else if (options.get(i).equals("#")) {
                nums.set(round - 1, nums.get(round - 1) * -1);
            }
        }

        for (Integer num : nums) {
            answer += num;
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "1T2D3D#";
        String a = "1D2S0T";
        System.out.println(solution(s));

    }
}

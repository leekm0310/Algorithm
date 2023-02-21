package level1;

import java.util.ArrayList;
import java.util.List;

public class Level1_32 {
    public static int solution(String dartResult) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        String[] split = dartResult.split("");
        char[] array = dartResult.toCharArray();
        for (int i = 1; i < array.length; i++) {
            if (array[i] == 'S') {
                list.add((int) Math.pow(Double.parseDouble(String.valueOf(array[i - 1])), 1));
            } else if (array[i] == 'D') {
                list.add((int) Math.pow(Double.parseDouble(String.valueOf(array[i - 1])), 2));
            } else if (array[i] == 'T') {
                list.add((int) Math.pow(Double.parseDouble(String.valueOf(array[i - 1])), 3));
            } else if (array[i] == '*') {
                int nums = i / 2;
                if (nums == 1) {
                    list.set(0, list.get(0) * 2);
                } else {
                    list.set(nums - 1, list.get(nums -1) * 2);
                    list.set(nums - 2, list.get(nums -2) * 2);
                }
            } else if (array[i] == '#') {
                int nums = i / 2;
                list.set(nums - 1, list.get(nums -1) * -1);
            } else if (array[i] == '0' && !Character.isLetter(array[i-1])) {
//                array[i] = '10'; 라고 쓰고 싶었는데 생각해보니 char 형이라 안됨.......ㅠㅠ
            }
        }

        for (Integer x : list) {
            answer += x;
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "1D2S#10S";
        System.out.println(solution(s));

    }
}

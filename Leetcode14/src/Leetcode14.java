//TODO: 리팩토링 해보자(리팩토링중)
public class Leetcode14 {
    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        String answer = "";
        if (arr == null) {
            answer = "";
        }
        String prefix = arr[0];
        for (int i = 1; i < arr.length; i++) {
            while(arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String answer = "";

        return answer;
    }
}
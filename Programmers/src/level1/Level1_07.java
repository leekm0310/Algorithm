package level1;

public class Level1_07 {
    public String solution(String[] seoul) {
        int answer = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = i;
                break;
            }
        }
        return "김서방은 " + answer +"에 있다";
    }
}

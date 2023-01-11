public class Level1_11 {
    public String solution(int n) {
        StringBuffer sb = new StringBuffer();
        String[] watermelon = {"수", "박"};
        for (int i = 0; i < n; i++) {
            sb.append(watermelon[i % 2]);
        }
        return sb.toString();
    }
}

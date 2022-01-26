public class Result {
    public static void main(String[] args) {
        int n = 7;
        int m = 19;
        int s = 2;
        int answer = 0;
        int a = m % n;
        if (n >= m) {
           answer = a + s - 1;
        } else if (a == 0 && s == 1){
            answer = n;
        } else if (a == 0 && s != 1) {
            answer = s -1;
        }
        if (n < m) {
            answer = a + s - 1;
        }
        System.out.println(answer);
    }
}
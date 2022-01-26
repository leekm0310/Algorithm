public class Result {
    public static void main(String[] args) {
        int x1=0;
        int v1=2;
        int x2=5;
        int v2=3;
        String answer="";
        for (int i = 1; i <= 10000; i++){
            int a = x1 + (v1 * i);
            int b = x2 + (v2 * i);
            if (a == b){
                answer = "YES";
                break;
            } else {
                answer = "NO";
            }
        }
        System.out.println(answer);
    }
}

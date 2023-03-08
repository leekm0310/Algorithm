package level1;

public class Level1_36 {
    public static int solution(int[][] sizes) {
        int answer = 0;

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int a = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = a;
            }
        }

        int width = 0;
        int height = 0;

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > width) {
                width = sizes[i][0];
            }
            if (sizes[i][1] > height) {
                height = sizes[i][1];
            }
        }

        answer = width * height;

        return answer;
    }

    public static void main(String[] args) {
        int[][] arr = {{8,15},{10, 7},{12, 3},{14, 7},{5, 15}};
        System.out.println(solution(arr));

    }
}

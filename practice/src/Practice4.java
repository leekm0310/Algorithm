public class Practice4 {
    //Least Recently Used
    public static int[] solution(int cacheSize, int[] list) {
        int[] cache = new int[cacheSize];

        for (int i : list) {
            int index = -1;
            for (int j = 0; j < cacheSize; j++) {
                if (i == cache[j]) {
                    index = j;
                }
            }

            //cache miss
            if (index == -1) {
                for (int j = cacheSize - 1; j >= 1; j--) {
                    cache[j] = cache[j - 1];
                }
                cache[0] = i;
            }
            //cache hit
            else {
                for (int j = index; j >= 1; j--) {
                    cache[j] = cache[j - 1];
                }
                cache[0] = i;
            }
        }
        return cache;
    }

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 2, 6, 2, 3, 5, 7};
        solution(5, list);
    }

}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalCase = Integer.parseInt(br.readLine());


        for (int j = 0; j < totalCase; j++) {
            int testcase = Integer.parseInt(br.readLine());
            TreeMap<Integer, Integer> treeMap = new TreeMap();

            for (int i = 0; i < testcase; i++) {
                String[] commandLine = br.readLine().split(" ");
                char command = commandLine[0].charAt(0);
                int number = Integer.parseInt(commandLine[1]);

                if (command == 'I') {
                    treeMap.put(number, treeMap.getOrDefault(number, 0) + 1);
                } else {
                    if (treeMap.size() == 0) {
                        continue;
                    }

                    int key = number == 1 ? treeMap.lastKey() : treeMap.firstKey();
                    if (treeMap.put(key, treeMap.get(key) - 1) == 1) {
                        treeMap.remove(key);
                    }
                }
            }

            if (treeMap.isEmpty()) {
                System.out.println("EMPTY");
            } else {
                System.out.println(treeMap.lastKey() + " " + treeMap.firstKey());
            }
        }

    }
}



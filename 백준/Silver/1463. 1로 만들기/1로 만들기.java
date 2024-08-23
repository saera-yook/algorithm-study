import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final Map<Integer, Integer> minCounts = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        minCounts.put(1, 0);
        minCounts.put(2, 1);
        minCounts.put(3, 1);
        int N = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(getMinCount(N)));
        br.close();
        bw.close();
    }

    private static int calculateMinCount(int n) {
        int minCount;
        if (n % 2 == 0) {
            if (n % 3 == 0) {
                minCount = 1 + Math.min(getMinCount(n / 3), getMinCount(n / 2));
            } else {
                minCount = 1 + Math.min(getMinCount(n / 2), getMinCount(n - 1));
            }
        } else {
            if (n % 3 == 0) {
                minCount = 1 + Math.min(getMinCount(n / 3), getMinCount(n - 1));
            } else {
                minCount = 1 + getMinCount(n - 1);
            }
        }
        return minCount;
    }

    private static int getMinCount(int n) {
        if (!minCounts.containsKey(n)) {
            minCounts.put(n, calculateMinCount(n));
        }
        return minCounts.get(n);
    }
}
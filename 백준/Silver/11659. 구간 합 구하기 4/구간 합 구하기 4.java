import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    private static final List<Integer> numbers = new ArrayList<>();
    private static final Map<Integer, Integer> totalSum = new HashMap();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        numbers.add(0);
        totalSum.put(0, 0);
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());
        stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers.add(Integer.parseInt(stk.nextToken()));
        }
        for (int k = 0; k < M; k++) {
            stk = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(stk.nextToken());
            int j = Integer.parseInt(stk.nextToken());
            sb.append(sum(j) - sum(i - 1)).append(System.lineSeparator());
        }
        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    private static int sum(int n) {
        if (!totalSum.containsKey(n)) {
            totalSum.put(n, sum(n - 1) + numbers.get(n));
        }
        return totalSum.get(n);
    }
}
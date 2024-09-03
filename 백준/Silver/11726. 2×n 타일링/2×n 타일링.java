import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final Map<Integer, Integer> cases = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        cases.put(1, 1);
        cases.put(2, 2);
        sb.append(calculateCases(N));
        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    private static int calculateCases(int n) {
        if (!cases.containsKey(n)) {
            cases.put(n, (calculateCases(n - 1) + calculateCases(n - 2)) % 10007);
        }
        return cases.get(n);
    }
}
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
        cases.put(1, 1);
        cases.put(2, 2);
        bw.write(String.valueOf(calculateCases(Integer.parseInt(br.readLine()))));
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
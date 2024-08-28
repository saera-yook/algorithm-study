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
        cases.put(1, 1);
        cases.put(2, 2);
        cases.put(3, 4);
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            sb.append(calculateCases(Integer.parseInt(br.readLine()))).append(System.lineSeparator());
        }
        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    private static int calculateCases(int n){
        if (!cases.containsKey(n)) {
            cases.put(n, calculateCases(n - 1) + calculateCases(n - 2) + calculateCases(n - 3));
        }
        return cases.get(n);
    }
}
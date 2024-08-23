import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final int maxN = 40;
    private static final List<Integer> countOf0 = new ArrayList<>();
    private static final List<Integer> countOf1 = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        countOf0.add(0, 1);
        countOf1.add(0, 0);
        countOf0.add(1, 0);
        countOf1.add(1, 1);
        for (int i = 2; i <= maxN; i++) {
            countOf0.add(i, null);
            countOf1.add(i, null);
        }
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(calculateCounts(countOf0, N)).append(" ").append(calculateCounts(countOf1, N)).append("\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.close();
    }
    
    private static int calculateCounts(List<Integer> list, int n) {
        if (list.get(n) == null) {
            list.set(n, calculateCounts(list, n - 1) + calculateCounts(list, n - 2));
        }
        return list.get(n);
    }
}
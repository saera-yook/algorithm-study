import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    private static int maxN = 40;
    private static int[] countOf0 = new int[maxN + 1];
    private static int[] countOf1 = new int[maxN + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        calculateCounts(maxN);
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(countOf0[N] + " ").append(countOf1[N] + "\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.close();
    }

    private static void calculateCounts(int n) {
        countOf0[0] = 1;
        countOf1[0] = 0;
        countOf0[1] = 0;
        countOf1[1] = 1;
        for (int i = 2; i <= n; i++) {
            countOf0[i] = countOf0[i - 1] + countOf0[i - 2];
            countOf1[i] = countOf1[i - 1] + countOf1[i - 2];
        }
    }
}
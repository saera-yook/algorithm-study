import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int M = 0;
        double sum = 0;
        for (int i = 0; i < N; i++) {
            int score = Integer.parseInt(stk.nextToken());
            if (score > M) {
                M = score;
            }
            sum += score;
        }
        bw.write(String.valueOf(100 * sum / (N * M)));
        bw.close();
    }
}
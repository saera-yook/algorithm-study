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
        int sum = 0;
        int newM;
        for (int i = 0; i < N; i++) {
            int score = Integer.parseInt(stk.nextToken());
            newM = score;
            if (newM > M) {
                M = newM;
            }
            sum += score;
        }
        double answer = (double) 100 * sum / (N * M);
        bw.write(String.valueOf(answer));
        bw.close();
    }
}
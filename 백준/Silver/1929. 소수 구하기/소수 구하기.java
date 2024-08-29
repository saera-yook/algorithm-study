import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(stk.nextToken());
        int N = Integer.parseInt(stk.nextToken());
        List<Boolean> prime = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            if (i == 1 || i < M) {
                prime.add(false);
            } else if (i != 2 && i % 2 == 0) {
                prime.add(false);
            } else {
                prime.add(true);
            }
        }
        for (int j = M; j <= N; j++) {
            for (int i = 3; i < Math.sqrt(N) + 1; i += 2) {
                if (j != i && j % i == 0) {
                    prime.set(j, false);
                    break;
                }
            }
        }
        for (int i = M; i <= N; i++) {
            if (prime.get(i)) {
                sb.append(i).append(System.lineSeparator());
            }
        }
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
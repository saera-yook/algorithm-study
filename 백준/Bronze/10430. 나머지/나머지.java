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
        StringBuilder sb = new StringBuilder();
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(stk.nextToken());
        int B = Integer.parseInt(stk.nextToken());
        int C = Integer.parseInt(stk.nextToken());
        sb.append((A + B) % C).append(System.lineSeparator()).append(((A % C) + (B % C)) % C)
                .append(System.lineSeparator()).append((A * B) % C).append(System.lineSeparator())
                .append(((A % C) * (B % C)) % C);
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
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
        int T = Integer.parseInt(br.readLine());
        StringTokenizer stk;
        for (int i = 1; i <= T; i++) {
            stk = new StringTokenizer(br.readLine());
            sb.append("Case #").append(i).append(": ")
                    .append(Integer.parseInt(stk.nextToken()) + Integer.parseInt(stk.nextToken()))
                    .append(System.lineSeparator());
        }
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
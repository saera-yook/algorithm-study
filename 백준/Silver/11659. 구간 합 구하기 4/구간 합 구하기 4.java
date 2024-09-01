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
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        stk = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            numbers.add(numbers.get(i - 1) + Integer.parseInt(stk.nextToken()));
        }
        for (int k = 0; k < M; k++) {
            stk = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(stk.nextToken());
            int j = Integer.parseInt(stk.nextToken());
            sb.append(numbers.get(j) - numbers.get(i - 1)).append(System.lineSeparator());
        }
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
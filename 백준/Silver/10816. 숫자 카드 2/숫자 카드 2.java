import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> cardNumbers = new HashMap<>();
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int numberToAdd = Integer.parseInt(stk.nextToken());
            Integer prevValue = cardNumbers.put(numberToAdd, 1);
            if (prevValue != null) {
                cardNumbers.replace(numberToAdd, prevValue + 1);
            }
        }
        int M = Integer.parseInt(br.readLine());
        stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            Integer count = cardNumbers.get(Integer.parseInt(stk.nextToken()));
            if (count == null) {
                sb.append("0 ");
            } else {
                sb.append(count).append(" ");
            }
        }
        bw.write(sb.toString());
        bw.close();
    }
}
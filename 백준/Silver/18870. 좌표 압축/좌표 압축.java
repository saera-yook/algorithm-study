import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        List<Integer> orders = new ArrayList<>();
        Map<Integer, Integer> counts = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(stk.nextToken());
            orders.add(number);
            counts.put(number, 0);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(counts.keySet());
        for (int i = 0; i < counts.size(); i++) {
            counts.put(queue.poll(), i);
        }
        for (int i = 0; i < N; i++) {
            sb.append(counts.get(orders.get(i))).append(" ");
        }
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
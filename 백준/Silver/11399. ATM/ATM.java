import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        List<Integer> times = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            times.add(Integer.parseInt(stk.nextToken()));
        }
        times.sort(Comparator.naturalOrder());
        int sumOfTime = 0;
        for (int i = 0; i < N; i++) {
            sumOfTime += times.get(i) * (N - i);
        }
        br.close();
        bw.write(sumOfTime + "\n");
        bw.close();
    }
}
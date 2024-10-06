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
        StringTokenizer stk;
        List<List<Integer>> meetings = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            stk = new StringTokenizer(br.readLine());
            meetings.add(List.of(Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken())));
        }
        meetings.sort(Comparator.<List<Integer>, Integer>comparing(meeting -> meeting.get(1))
                .thenComparing(meeting -> meeting.get(0)));
        int count = 0;
        int endT = 0;
        for (int i = 0; i < N; i++) {
            if (meetings.get(i).get(0) >= endT) {
                endT = meetings.get(i).get(1);
                count++;
            }
        }
        bw.write(String.valueOf(count));
        br.close();
        bw.close();
    }
}
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
    private static List<Integer> cards;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        cards = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            cards.add(Integer.parseInt(stk.nextToken()));
        }
        cards.sort(Comparator.naturalOrder());
        int M = Integer.parseInt(br.readLine());
        stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int low = 0;
            int high = N - 1;
            int testNumber = Integer.parseInt(stk.nextToken());
            if (isExist(testNumber, low, high)) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }
        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    private static boolean isExist(int n, int low, int high) {
        if (low > high) {
            return false;
        }
        int mid = (int) Math.floor((low + high) / 2.0);
        int existNumber = cards.get(mid);
        if (n < existNumber) {
            return isExist(n, low, mid - 1);
        } else if (n > existNumber){
            return isExist(n, mid + 1, high);
        } else {
            return true;
        }
    }
}
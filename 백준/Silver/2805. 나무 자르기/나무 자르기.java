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
        List<Integer> trees = new ArrayList<>();
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());
        stk = new StringTokenizer(br.readLine());
        int min = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            trees.add(Integer.parseInt(stk.nextToken()));
            if (max < trees.get(i)) {
                max = trees.get(i);
            }
        }
        int height = 0;
        while (min <= max) {
            long sum = 0;
            int mid = (min + max) / 2;
            for (Integer tree : trees) {
                if (tree > mid) {
                    sum += tree - mid;
                }
                if (sum > M) {
                    break;
                }
            }
            if (sum >= M) {
                height = mid;
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        bw.write(String.valueOf(height));
        br.close();
        bw.close();
    }
}
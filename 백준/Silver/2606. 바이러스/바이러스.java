import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int C = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        Set<Integer> network1 = new HashSet<>();
        network1.add(1);
        StringTokenizer stk;
        for (int i = 0; i < N; i++) {
            stk = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stk.nextToken());
            int b = Integer.parseInt(stk.nextToken());
            if (network1.contains(a)) {
                network1.add(b);
            } else if (network1.contains(b)) {
                network1.add(a);
            } else {
                left.add(a);
                right.add(b);
            }
        }
        boolean isChanged;
        do {
            isChanged = false;
            int k = left.size();
            for (int i = k - 1; i >= 0; i--) {
                if (network1.contains(left.get(i))) {
                    network1.add(right.remove(i));
                    left.remove(i);
                    isChanged = true;
                } else if (network1.contains(right.get(i))) {
                    network1.add(left.remove(i));
                    right.remove(i);
                    isChanged = true;
                }
            }
        } while (isChanged);
        bw.write(String.valueOf(network1.size() - 1));
        br.close();
        bw.close();
    }
}
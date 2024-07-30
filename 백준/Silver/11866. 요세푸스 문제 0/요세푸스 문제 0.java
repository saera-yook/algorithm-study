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
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int K = Integer.parseInt(stk.nextToken());
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            numbers.add(i + 1);
        }
        List<Integer> permutation = new ArrayList<>();
        int position = 0;
        while (numbers.size() != 1) {
            for (int i = 0; i < K - 1; i++) {
                if (position == numbers.size() - 1) {
                    position = 0;
                } else if (position > numbers.size() - 1) {
                    position = 1;
                } else {
                    position++;
                }
            }
            permutation.add(numbers.remove(position));
        }
        permutation.add(numbers.get(0));
        bw.write(permutation.toString().replace('[', '<').replace(']', '>'));
        bw.flush();
    }
}
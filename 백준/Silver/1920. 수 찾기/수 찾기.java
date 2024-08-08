import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Set<Integer> existNumbers = new HashSet<>();
        String[] inputNumbers = br.readLine().split("\\s+");
        for (int i = 0; i < N; i++) {
            existNumbers.add(Integer.parseInt(inputNumbers[i]));
        }
        int M = Integer.parseInt(br.readLine());
        inputNumbers = br.readLine().split("\\s+");
        for (int i = 0; i < M; i++) {
            if (existNumbers.contains(Integer.parseInt(inputNumbers[i]))) {
                sb.append("1").append("\n");
            } else {
                sb.append("0").append("\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
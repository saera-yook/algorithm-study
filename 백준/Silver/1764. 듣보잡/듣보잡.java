import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());
        Set<String> names = new HashSet<>();
        for (int i = 0; i < N; i++) {
            names.add(br.readLine());
        }
        List<String> namesToPrint = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String newName = br.readLine();
            if (names.contains(newName)) {
                namesToPrint.add(newName);
            }
        }
        namesToPrint.sort(Comparator.naturalOrder());
        sb.append(namesToPrint.size()).append(System.lineSeparator());
        for (String name : namesToPrint) {
            sb.append(name).append(System.lineSeparator());
        }
        br.close();
        bw.write(sb.toString());
        bw.close();
    }
}
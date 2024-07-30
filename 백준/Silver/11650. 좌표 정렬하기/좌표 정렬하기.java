import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        List<String> coordinates = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            coordinates.add(br.readLine());
        }
        coordinates.sort(Comparator
                .comparing(xy -> Integer.parseInt(xy.toString().split(" ")[0]))
                .thenComparing(xy -> Integer.parseInt(xy.toString().split(" ")[1])));
        coordinates.forEach(coordinate -> sb.append(coordinate).append(System.lineSeparator()));
        bw.write(sb.toString());
        bw.flush();
    }
}
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
        List<String> registration = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            registration.add(br.readLine());
        }
        registration.sort(Comparator.comparing(String -> Integer.parseInt(String.split(" ")[0])));
        for (String person : registration) {
            sb.append(person).append(System.lineSeparator());
        }
        bw.write(sb.toString());
        bw.flush();
    }
}      
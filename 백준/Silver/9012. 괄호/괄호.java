import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String PS = br.readLine();
            String trimmedPS = PS.replaceAll("\\(\\)", "");
            while (PS.length() != trimmedPS.length()) {
                PS = trimmedPS;
                trimmedPS = PS.replaceAll("\\(\\)", "");
            }
            if (trimmedPS.isEmpty()) {
                sb.append("YES").append(System.lineSeparator());
            } else {
                sb.append("NO").append(System.lineSeparator());
            }
        }
        bw.write(sb.toString());
        bw.close();
    }
}
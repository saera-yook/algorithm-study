import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int participants = Integer.parseInt(br.readLine());
        StringTokenizer stk1 = new StringTokenizer(br.readLine());
        StringTokenizer stk2 = new StringTokenizer(br.readLine());
        int shirtBundleQuantity = Integer.parseInt(stk2.nextToken());
        int penBundleQuantity = Integer.parseInt(stk2.nextToken());
        sb.append(Collections.list(stk1).stream()
                        .mapToInt(token -> Integer.parseInt(token.toString()))
                        .map(number -> {
                            if (number % shirtBundleQuantity == 0) {
                                return number / shirtBundleQuantity;
                            }
                            return number / shirtBundleQuantity + 1;
                        }).sum())
                .append(System.lineSeparator());
        sb.append(participants / penBundleQuantity).append(" ").append(participants % penBundleQuantity);
        bw.write(sb.toString());
        bw.close();
    }
}
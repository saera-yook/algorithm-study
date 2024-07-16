import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
        int order = 0;
        for (int i = 0; i < 6; i++) {
            int number = Integer.parseInt(stk1.nextToken());
            if (number % shirtBundleQuantity == 0) {
                order += number / shirtBundleQuantity;
            } else {
                order += number / shirtBundleQuantity + 1;
            }
        }
        sb.append(order).append(System.lineSeparator());
        sb.append(participants / penBundleQuantity).append(" ").append(participants % penBundleQuantity);
        bw.write(sb.toString());
        bw.close();
    }
}
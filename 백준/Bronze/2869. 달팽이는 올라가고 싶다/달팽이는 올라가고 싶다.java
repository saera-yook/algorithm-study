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
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(stk.nextToken());
        int B = Integer.parseInt(stk.nextToken());
        int V = Integer.parseInt(stk.nextToken());
        int height = A - B;
        int leftHeight = V - A;
        int day = leftHeight / height;
        if (leftHeight > 0) {
            if (leftHeight < height) {
                sb.append(2);
            } else if (leftHeight - day * height == 0) {
                sb.append(day + 1);
            } else {
                sb.append(day + 2);
            }
        } else {
            sb.append(1);
        }
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
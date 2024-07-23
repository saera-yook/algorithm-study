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
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());
        int n1;
        int n2;
        if (a < b) {
            n1 = b;
            n2 = a;
        } else {
            n1 = a;
            n2 = b;
        }
        while (0 != n1 % n2) {
            int tmp = n1 % n2;
            n1 = n2;
            n2 = tmp;
        }
        int GCD = n2;
        int LCM = a * b / GCD;
        bw.write(GCD + System.lineSeparator() + LCM);
        bw.close();
    }
}  
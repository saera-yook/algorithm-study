import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int exponent = Integer.toBinaryString(N).length();
        if (N == Math.pow(2, exponent) - N) {
            bw.write(String.valueOf(N));
        } else {
            bw.write(String.valueOf((int) (Math.pow(2, exponent) - Math.pow(2, exponent + 1) + 2 * N)));
        }
        bw.close();
    }
}
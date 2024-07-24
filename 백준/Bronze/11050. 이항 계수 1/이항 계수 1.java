import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        bw.write(String.valueOf(factorial(N, 0) / (factorial(N, K) * factorial(K, 0))));
        bw.close();
    }

    private static int factorial(int a, int b) {
        int multiple = 1;
        for (int i = a - b; i > 0 ; i--) {
            multiple *= i;
        }
        return multiple;
    }
}
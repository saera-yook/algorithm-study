import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = br.read() - '0';
        br.skip(1);
        int b = br.read() - '0';
        double answer = (double) a / b;
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
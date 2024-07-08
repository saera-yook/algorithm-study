import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int number = br.read() - '0';
        for (int i = 1; i < 10; i++) {
            bw.write(number + " * " + i + " = " + number * i);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
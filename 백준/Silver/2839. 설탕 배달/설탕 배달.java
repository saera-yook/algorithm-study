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
        if (N == 3) {
            bw.write(String.valueOf(1));
        } else if (N == 4 || N == 7) {
            bw.write(String.valueOf(-1));
        } else {
            switch (N % 5) {
                case 0:
                    bw.write(String.valueOf(N / 5));
                    break;
                case 1:
                    bw.write(String.valueOf(N / 5 + 1));
                    break;
                case 2:
                    bw.write(String.valueOf(N / 5 + 2));
                    break;
                case 3:
                    bw.write(String.valueOf(N / 5 + 1));
                    break;
                case 4:
                    bw.write(String.valueOf(N / 5 + 2));
                    break;
            }
        }
        br.close();
        bw.close();
    }
}
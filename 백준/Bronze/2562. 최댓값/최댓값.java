import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0;
        int max = 0;
        for (int i = 0; i < 9; i++) {
            int number = Integer.parseInt(br.readLine());
            if (max < number) {
                max = number;
                count = i + 1;
            }
        }
        bw.write(String.valueOf(max) + System.lineSeparator() + String.valueOf(count));
        bw.close();
    }
}
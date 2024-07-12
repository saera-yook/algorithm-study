import static java.util.Arrays.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br.readLine();
        int[] numbers = stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int min = stream(numbers).min().orElseThrow();
        int max = stream(numbers).max().orElseThrow();
        bw.write(String.valueOf(min) + " " + String.valueOf(max));
        bw.close();
    }
}
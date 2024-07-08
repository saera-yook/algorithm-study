import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (numbers[0] == numbers[1]) {
            bw.write("==");
        } else if (numbers[0] > numbers[1]) {
            bw.write(">");
        } else {
            bw.write("<");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
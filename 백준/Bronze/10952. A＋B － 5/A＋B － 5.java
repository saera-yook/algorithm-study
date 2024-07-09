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
        String input = br.readLine();
        while (!input.startsWith("0")) {
            int[] numbers = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            bw.write(numbers[0] + numbers[1] + System.lineSeparator());
            input = br.readLine();
        }
        bw.close();
    }
}
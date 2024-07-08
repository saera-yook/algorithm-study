import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> results = List.of(
                numbers[0] + numbers[1],
                numbers[0] - numbers[1],
                numbers[0] * numbers[1],
                numbers[0] / numbers[1],
                numbers[0] % numbers[1]);
        for (Integer each : results) {
            bw.write(each.toString().concat(System.lineSeparator()));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
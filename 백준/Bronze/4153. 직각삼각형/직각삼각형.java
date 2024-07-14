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
        while (true) {
            int[] numbers = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(each -> (int) Math.pow(Integer.parseInt(each), 2))
                    .sorted()
                    .toArray();
            if (Arrays.stream(numbers).allMatch(value -> 0 == value)) {
                break;
            }
            if (numbers[2] == numbers[0] + numbers[1]) {
                bw.write("right" + System.lineSeparator());
            } else {
                bw.write("wrong" + System.lineSeparator());
            }
        }
        bw.close();
    }
}
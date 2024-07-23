import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String testCase = br.readLine();
        while (!"0".equals(testCase)) {
            char[] digits = testCase.toCharArray();
            int size = digits.length;
            if (size == 1) {
                sb.append("yes").append(System.lineSeparator());
            } else if (size < 4) {
                if (digits[0] == digits[size - 1]) {
                    sb.append("yes").append(System.lineSeparator());
                } else {
                    sb.append("no").append(System.lineSeparator());
                }
            } else {
                if (digits[0] == digits[size - 1] && digits[1] == digits[size - 2]) {
                    sb.append("yes").append(System.lineSeparator());
                } else {
                    sb.append("no").append(System.lineSeparator());
                }
            }
            testCase = br.readLine();
        }
        bw.write(sb.toString());
        bw.close();
    }
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int nextNumber = 0;
        for (int i = 0; i < 3; i++) {
            String str = br.readLine();
            int n = 0;
            try {
                n = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                str = null;
            }
            if (n != 0) {
                nextNumber = n + 3 - i;
            }
        }
        if (nextNumber != 0) {
            bw.write(fizzBuzz(nextNumber));
        }
        br.close();
        bw.close();
    }

    private static String fizzBuzz(int n) {
        if (n % 3 == 0) {
            if (n % 5 == 0) {
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        } else {
            if (n % 5 == 0) {
                return "Buzz";
            } else {
                return String.valueOf(n);
            }
        }
    }
}
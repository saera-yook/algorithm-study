import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Integer number = Integer.valueOf(stk.nextToken());
            if (1 != number) {
                numbers.add(number);
            }
        }
        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
        for (int i : primeNumbers) {
            numbers.removeIf(j -> i != j && j % i == 0);
        }
        bw.write(String.valueOf(numbers.size()));
        bw.close();
    }
}
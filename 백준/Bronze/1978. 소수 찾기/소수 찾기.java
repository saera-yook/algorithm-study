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
        long primeNumberCount = numbers.stream()
                .filter(number -> number % 2 != 0 || number == 2)
                .filter(number -> number % 3 != 0 || number == 3)
                .filter(number -> number % 5 != 0 || number == 5)
                .filter(number -> number % 7 != 0 || number == 7)
                .filter(number -> number % 11 != 0 || number == 11)
                .filter(number -> number % 13 != 0 || number == 13)
                .filter(number -> number % 17 != 0 || number == 17)
                .filter(number -> number % 19 != 0 || number == 19)
                .filter(number -> number % 23 != 0 || number == 23)
                .filter(number -> number % 29 != 0 || number == 29)
                .filter(number -> number % 31 != 0 || number == 31)
                .count();
        bw.write(String.valueOf(primeNumberCount));
        bw.close();
    }
}
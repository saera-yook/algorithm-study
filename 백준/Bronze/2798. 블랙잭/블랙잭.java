import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int countOfCards = Integer.parseInt(stk.nextToken());
        int upperBoundNumber = Integer.parseInt(stk.nextToken());
        stk = new StringTokenizer(br.readLine());
        List<Integer> cardNumbers = new ArrayList<>();
        for (int i = 0; i < countOfCards; i++) {
            int number = Integer.parseInt(stk.nextToken());
            if (number <= upperBoundNumber - 3) {
                cardNumbers.add(number);
            }
        }
        List<Integer> sumTo3Numbers = new ArrayList<>();
        for (int i = 0; i < cardNumbers.size() - 2; i++) {
            for (int j = i + 1; j < cardNumbers.size() - 1; j++) {
                if (cardNumbers.get(i) + cardNumbers.get(j) < upperBoundNumber) {
                    for (int k = j + 1; k < cardNumbers.size(); k++) {
                        int sum = cardNumbers.get(i) + cardNumbers.get(j) + cardNumbers.get(k);
                        if (sum <= upperBoundNumber) {
                            sumTo3Numbers.add(sum);
                        }
                    }
                }
            }
        }
        bw.write(String.valueOf(sumTo3Numbers.stream().max(Comparator.comparingInt(Integer::intValue)).orElseThrow()));
        bw.close();
    }
}
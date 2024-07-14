import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cases = Integer.parseInt(br.readLine());
        for (int i = 0; i < cases; i++) {
            String[] input = br.readLine().split(" ");
            int count = Integer.parseInt(input[0]);
            List<String> strings = new ArrayList<>();
            for (int j = 0; j < input[1].length(); j++) {
                strings.add(String.valueOf(input[1].toCharArray()[j]));
            }
            bw.write(strings.stream().map(each -> each.repeat(count)).collect(Collectors.joining()));
            bw.newLine();
        }
        bw.close();
    }
}
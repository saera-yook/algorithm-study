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
        int participants = Integer.parseInt(br.readLine());
        int[] tShirtsQuantities = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] bundleQuantities = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        bw.write(String.valueOf(Arrays.stream(tShirtsQuantities)
                .map(number -> {
                    if (number % bundleQuantities[0] == 0) {
                        return number / bundleQuantities[0];
                    }
                    return number / bundleQuantities[0] + 1;
                }).sum()));
        bw.newLine();
        bw.write(participants / bundleQuantities[1] + " " + participants % bundleQuantities[1]);
        bw.close();
    }
}
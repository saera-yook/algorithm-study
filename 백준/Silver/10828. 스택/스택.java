import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Main {
    private static final String SIZE = "size";
    private static final String EMPTY = "empty";
    private static final String TOP = "top";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk;
        LinkedList<Integer> stack = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            stk = new StringTokenizer(br.readLine());
            String command = stk.nextToken();
            if (stk.hasMoreTokens()) {
                stack.push(Integer.parseInt(stk.nextToken()));
            } else if (EMPTY.equals(command)) {
                if (stack.isEmpty()) {
                    bw.write(1 + System.lineSeparator());
                } else {
                    bw.write(0 + System.lineSeparator());
                }
            } else if (SIZE.equals(command)) {
                bw.write(stack.size() + System.lineSeparator());
            } else {
                try {
                    if (TOP.equals(command)) {
                        bw.write(stack.getFirst() + System.lineSeparator());
                    } else {
                        bw.write(stack.pop() + System.lineSeparator());
                    }
                } catch (NoSuchElementException e) {
                    bw.write(-1 + System.lineSeparator());
                }
            }
        }
        bw.close();
    }
}
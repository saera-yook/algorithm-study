import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Main {
    private static final String POP = "pop";
    private static final String SIZE = "size";
    private static final String EMPTY = "empty";
    private static final String FRONT = "front";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer stk;
        LinkedList<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            stk = new StringTokenizer(br.readLine());
            String command = stk.nextToken();
            try {
                switch (command) {
                    case "push":
                        queue.offer(Integer.parseInt(stk.nextToken()));
                        break;
                    case EMPTY:
                        if (queue.isEmpty()) {
                            sb.append(1).append(System.lineSeparator());
                        } else {
                            sb.append(0).append(System.lineSeparator());
                        }
                        break;
                    case SIZE:
                        sb.append(queue.size()).append(System.lineSeparator());
                        break;
                    case POP:
                        sb.append(queue.removeFirst()).append(System.lineSeparator());
                        break;
                    case FRONT:
                        sb.append(queue.getFirst()).append(System.lineSeparator());
                        break;
                    default:
                        sb.append(queue.getLast()).append(System.lineSeparator());
                        break;
                }
            } catch (NoSuchElementException e) {
                sb.append(-1).append(System.lineSeparator());
            }
        }
        br.close();
        bw.write(sb.toString());
        bw.close();
    }
}
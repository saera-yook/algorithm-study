import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;
    private static BufferedWriter bw;
    private static StringTokenizer stk;
    private static int width;
    private static int length;
    private static int count;
    private static int worms;
    private static int[][] field;
    private static boolean[][] visited;
    private static final LinkedList<Integer> row = new LinkedList<>();
    private static final LinkedList<Integer> column = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        stk = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(stk.nextToken());
        for (int i = 0; i < T; i++) {
            init();
            sb.append(calculateWorms()).append(System.lineSeparator());
        }
        bw.write(sb.toString());
        br.close();
        bw.close();
    }

    private static void init() throws IOException {
        stk = new StringTokenizer(br.readLine());
        width = Integer.parseInt(stk.nextToken());
        length = Integer.parseInt(stk.nextToken());
        count = Integer.parseInt(stk.nextToken());
        worms = 0;
        field = new int[length][width];
        visited = new boolean[length][width];
        for (int i = 0; i < count; i++) {
            stk = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(stk.nextToken());
            int Y = Integer.parseInt(stk.nextToken());
            field[Y][X] = 1;
        }
    }

    private static int calculateWorms() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                if (hasCabbage(i, j)) {
                    findArea();
                }
                if (count == 0) {
                    break;
                }
            }
            if (count == 0) {
                break;
            }
        }
        return worms;
    }

    private static boolean hasCabbage(int a, int b) {
        if (field[a][b] == 1 && !visited[a][b]) {
            row.offer(a);
            column.offer(b);
            visited[a][b] = true;
            count--;
            return true;
        }
        return false;
    }

    private static void findArea() {
        while (!row.isEmpty()) {
            int r = row.poll();
            int c = column.poll();
            if (r > 0) {
                hasCabbage(r - 1, c);
            }
            if (r < length - 1) {
                hasCabbage(r + 1, c);
            }
            if (c > 0) {
                hasCabbage(r, c - 1);
            }
            if (c < width - 1) {
                hasCabbage(r, c + 1);
            }
        }
        worms++;
    }
}
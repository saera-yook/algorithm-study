import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());
        if (M == 0) {
            bw.write(String.valueOf(N));
        } else {
            int[][] edges = new int[N + 1][N + 1];
            for (int i = 0; i < M; i++) {
                stk = new StringTokenizer(br.readLine());
                int u = Integer.parseInt(stk.nextToken());
                int v = Integer.parseInt(stk.nextToken());
                edges[u][v] = 1;
                edges[v][u] = 1;
            }
            bw.write(String.valueOf(bfs(N, M, edges)));
        }
        br.close();
        bw.close();
    }

    private static int bfs(int N, int M, int[][] edges) {
        boolean[] isVisited = new boolean[N + 1];
        LinkedList<Integer> queue = new LinkedList<>();
        int result = 0;
        while (M > 0) {
            for (int i = 1; i <= N; i++) {
                if (!isVisited[i]) {
                    queue.offer(i);
                    break;
                }
            }
            while (!queue.isEmpty()) {
                int node = queue.poll();
                isVisited[node] = true;
                for (int i = 1; i <= N; i++) {
                    if (edges[node][i] == 1 && !isVisited[i]) {
                        if (!queue.contains(i)) {
                            queue.offer(i);
                        }
                        M--;
                    }
                }
            }
            result++;
        }
        for (int i = 1; i <= N; i++) {
            if (!isVisited[i]) {
                result++;
            }
        }
        return result;
    }
}
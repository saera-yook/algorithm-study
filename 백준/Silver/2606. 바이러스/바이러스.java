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
        int C = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        boolean[][] edges = new boolean[C][C];
        StringTokenizer stk;
        for (int i = 0; i < N; i++) {
            stk = new StringTokenizer(br.readLine());
            int j = Integer.parseInt(stk.nextToken());
            int k = Integer.parseInt(stk.nextToken());
            edges[j - 1][k - 1] = true;
            edges[k - 1][j - 1] = true;
        }
        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[C];
        queue.add(1);
        visited[0] = true;
        while (!queue.isEmpty()) {
            int c = queue.poll();
            for (int i = 0; i < C; i++) {
                if (edges[c - 1][i] && !visited[i]) {
                    queue.offer(i + 1);
                    visited[i] = true;
                }
            }
        }
        int count = 0;
        for (boolean infected : visited) {
            if (infected) {
                count++;
            }
        }
        bw.write(String.valueOf(count - 1));
        br.close();
        bw.close();
    }
}
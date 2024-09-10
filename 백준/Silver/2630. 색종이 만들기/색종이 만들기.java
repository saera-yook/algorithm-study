import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int K = (int) (Math.log(N) / Math.log(2));
        int[][] paper = new int[N][N];
        int white = 0;
        int blue = 0;
        StringTokenizer stk;
        for (int i = 0; i < N; i++) {
            stk = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(stk.nextToken());
            }
        }
        int[][] prevPaper = paper;
        int[][] newPaper;
        for (int h = 1; h <= K; h++) {
            int newN = (int) Math.pow(2, K - h);
            newPaper = new int[newN][newN];
            for (int i = 0; i < newN; i++) {
                for (int j = 0; j < newN; j++) {
                    int a = 2 * i;
                    int b = 2 * j;
                    int[] pieces = new int[4];
                    pieces[0] = prevPaper[a][b];
                    pieces[1] = prevPaper[a][b + 1];
                    pieces[2] = prevPaper[a + 1][b];
                    pieces[3] = prevPaper[a + 1][b + 1];
                    int sum = 0;
                    for (int number : pieces) {
                        if (number == -1) {
                            newPaper[i][j] = -1;
                        } else {
                            sum += number;
                        }
                    }
                    if (newPaper[i][j] == -1) {
                        for (int number : pieces) {
                            if (number == 0) {
                                white++;
                            } else if (number == 1) {
                                blue++;
                            }
                        }
                    } else {
                        if (sum == 0) {
                            newPaper[i][j] = 0;
                        } else if (sum == 4) {
                            newPaper[i][j] = 1;
                        } else {
                            newPaper[i][j] = -1;
                            for (int number : pieces) {
                                if (number == 0) {
                                    white++;
                                } else if (number == 1) {
                                    blue++;
                                }
                            }
                        }
                    }
                }
            }
            prevPaper = newPaper;
        }
        if (prevPaper[0][0] == 0) {
            white++;
        } else if (prevPaper[0][0] == 1) {
            blue++;
        }
        sb.append(white).append(System.lineSeparator()).append(blue);
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
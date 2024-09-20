import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        sb.append("|\\_/|").append(System.lineSeparator()).append("|q p|   /}").append(System.lineSeparator())
                .append("( 0 )\"\"\"\\").append(System.lineSeparator()).append("|\"^\"`    |")
                .append(System.lineSeparator()).append("||_/=\\\\__|");
        bw.write(sb.toString());
        bw.close();
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());

        List<Integer> nums = new ArrayList<>();
        stk = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums.add(Integer.parseInt(stk.nextToken()));
        }
        nums.sort(Comparator.naturalOrder());
        
        int count = 0;

        for (int i = 0; i < N; i++) {
            int target = nums.get(i);
            int start = 0;
            int end = N - 1;
            
            while (start != end) {
                int sum = nums.get(start) + nums.get(end);
                if (sum == target) {
                    if (start != i && end != i) {
                        count++;
                        break;
                    } else if (start == i) {
                        start++;
                    } else if (end == i) {
                        end--;
                    }
                } else if (sum < target) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        System.out.println(count);
    }
}

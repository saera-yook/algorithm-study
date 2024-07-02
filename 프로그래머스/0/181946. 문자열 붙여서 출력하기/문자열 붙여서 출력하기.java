import java.util.Scanner;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b;
        while (true) {
            a = sc.next();
            if (validate(a) != null) {
                continue;
            } break;
        }
        while (true) {
            b = sc.next();
            if (validate(b) != null) {
                continue;
            } break;
        }
        System.out.print(a + b);
        sc.close();
    }
    
    private static String validate(String input) {
        String alert = null;
        try {
            validateLengthOf(input);
        } catch (IOException e) {
            alert = e.getMessage();
            System.out.println(alert);
        }
        return alert;
    }
    
    private static void validateLengthOf(String str) throws IOException {
        int stringLength = str.length();
        if (stringLength < 1 || stringLength > 10) {
            throw new IOException("문자열의 길이는 1 이상, 10 이하여야 합니다.");
        }
    }
}
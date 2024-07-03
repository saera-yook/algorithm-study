import java.util.stream.IntStream;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        long count_P = s.chars().filter(character -> character == 'P' || character == 'p').count();
        long count_Y = s.chars().filter(character -> character == 'Y' || character == 'y').count();
        if (count_P != count_Y) {
            answer = false;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
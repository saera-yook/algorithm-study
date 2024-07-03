class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        long count_P = s.chars().filter(character -> character == 'P' || character == 'p').count();
        long count_Y = s.chars().filter(character -> character == 'Y' || character == 'y').count();
        if (count_P != count_Y) {
            answer = false;
        }
        return answer;
    }
}
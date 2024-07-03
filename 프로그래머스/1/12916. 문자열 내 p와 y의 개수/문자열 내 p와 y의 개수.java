class Solution {
    boolean solution(String s) {
        return s.chars().filter(character -> character == 'P' || character == 'p').count() 
            == s.chars().filter(character -> character == 'Y' || character == 'y').count();
    }
}
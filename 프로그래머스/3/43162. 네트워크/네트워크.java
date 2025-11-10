class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                answer++;
                dfs(i, computers, visited);
            }
        }
        
        return answer;
    }
    
    private void dfs(int i, int[][] computers, boolean[] visited) {
        int[] list = computers[i];
        for(int j = 0; j < list.length; j++) {
            if (list[j] == 1 && i != j) {
                if (!visited[j]) {
                    visited[j] = true;
                    dfs(j, computers, visited);
                }
                
            }
        }
        
    }
}
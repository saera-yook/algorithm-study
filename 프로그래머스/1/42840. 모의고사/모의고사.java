import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] counts = {0,0,0};
        int max = 0;
        
        counts[0] = supoja1(answers);
        counts[1] = supoja2(answers);
        max = Math.max(counts[0], counts[1]);
        
        counts[2] = supoja3(answers);        
        max = Math.max(max, counts[2]);
               
        int N = 0;
        int[] isMax = {0, 0, 0};
        for (int i = 0; i < 3; i++) {
            if (counts[i] == max) {
                N++;
                isMax[i] = 1;
            }
        }
        
        int[] answer = new int[N];
        
        for (int i = 0; i < 3; i++) {
            if (isMax[i] == 1) {
                for (int k = 0; k < answer.length; k++) {
                    if (answer[k] == 0) {
                        answer[k] = i + 1;
                        break;
                    }          
                }        
            }   
        }
        
        return answer;
    }
    
    public int supoja1(int[] answers) {
        int count = 0;
        for (int i = 0; i < answers.length; i++) {
            switch (i % 5) {
                case 0 -> {
                    if (answers[i] == 1) {
                        count++;
                    }
                }
                case 1 -> {
                    if (answers[i] == 2) {
                        count++;
                    }
                } 
                case 2 -> {
                    if (answers[i] == 3) {
                        count++;
                    }
                }
                case 3 -> {
                    if (answers[i] == 4) {
                        count++;
                    }
                } 
                case 4 -> { 
                    if (answers[i] == 5) {
                        count++;
                    }
                }
            } 
        }
        return count;
    }
    
    public int supoja2(int[] answers) {
        int count = 0;
        for (int i = 0; i < answers.length; i++) {
            if (i % 2 == 0 && answers[i] == 2) {
                count++;
            }
            if (i % 2 == 1) {
                switch (i % 8) {
                    case 1 -> {
                            if(answers[i] == 1) {
                                count++;
                            }
                        }
                    case 3 -> {
                            if(answers[i] == 3) {
                                count++;
                            }
                        }
                    case 5 -> {
                            if(answers[i] == 4) {
                                count++;
                            }
                        }
                    case 7 -> {
                            if(answers[i] == 5) {
                                count++;
                            }
                        }
                }
            }
        }
        return count;
    }
    
    public int supoja3(int[] answers) {
        int count = 0;
        for (int i = 0; i < answers.length; i++) {
            switch (i % 10) {
                    case 0, 1 -> {
                        if(answers[i] == 3) {
                            count++;
                        }
                    }
                    case 2, 3 -> {
                        if(answers[i] == 1) {
                            count++;
                        }
                    }
                    case 4, 5 -> {
                        if(answers[i] == 2) {
                            count++;
                        }
                    }
                    case 6 ,7 -> {
                        if(answers[i] == 4) {
                            count++;
                        }
                    }
                    case 8, 9 -> {
                        if(answers[i] == 5) {
                            count++;
                        }
                    }
            }
        }
        return count;
    }
}
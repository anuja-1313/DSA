package LeetCodeContests.contest446;
import java.util.*;

public class CalculateScoreAfterPerformingInstructions {

//Time Complexity: O(N)
//Space Complexity: O(N)
//Q1. Calculate Score After Performing Instructions - Medium
    class Solution {
        public long calculateScore(String[] instructions, int[] values) {
            //int in = instructions.length();
            int val = values.length;

            int[] visited = new int[val];
            Arrays.fill(visited, 1);

            int i=0;
            long score = 0;
            while(i < val && i >= 0 && visited[i] == 1){
                visited[i] = 0;
                if(instructions[i].equals("jump")){
                    i = i + (values[i]);
                }
                else if(instructions[i].equals("add")){
                    score = score + (values[i]);
                    i++;
                }
                else {
                    break;
                }
            }

            return score;
        }
    }

}

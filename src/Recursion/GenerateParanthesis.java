package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
/*
22. Generate Parentheses (Medium)
Time: O(4^n / √n) , “Balanced parentheses = Catalan pattern → 4^n / √n time”
Space: O(n) (excluding output)
*/
    class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> list = new ArrayList<>();
            String output = "";
            int open = n;
            int close = n;

            solve(list, output, open , close);

            return list;
        }
        void solve(List<String> list, String output, int open, int close){
            if(open == 0 && close == 0){
                list.add(output);
                return;
            }

            //opening bracket choice
            if(open > 0){
                solve(list, output + "(", open-1, close);
            }

            //closing bracket choice
            if(close > open){
                solve(list, output + ")", open, close-1);
            }
        }
    }
}

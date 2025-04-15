package Strings;

public class MaxNestingDepthOfParanthesis {
    /*
1614. Maximum Nesting Depth of the Parentheses - Easy
TC: O(N)
SC: O(1)
*/
    class Solution {
        public int maxDepth(String s) {
            int max = 0;
            int count = 0;
            for(int i=0; i<s.length(); i++){
                char ch = s.charAt(i);
                if(ch =='('){
                    count++;
                    max = Math.max(count, max);
                }
                else if(ch == ')'){
                    count--;
                }
            }
            return max;
        }
    }
}

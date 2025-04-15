package Strings;

public class LPS_PatternMatching {

    /*
TC : O(N+M) , N-text length, M-pattern length
SC : O(N+M) , due to LPS array
*/

    class Solution {
        int search(String text, String pat) {
            // code here
            String s = pat + "#" + text;
            int lps[] = LPS(s);
            for(int i=0; i<s.length(); i++){
                if(lps[i] == pat.length()){
                    return 1;
                }
            }
            return 0;
        }

        int[] LPS(String s){
            int n = s.length();
            int[] lps = new int[n];
            lps[0] = 0;

            for(int i=1; i<n; i++){
                int len = lps[i-1];
                if(s.charAt(i) == s.charAt(len)){
                    lps[i] = len + 1;
                }
                else{
                    while(s.charAt(i) != s.charAt(len)){
                        if(len == 0){
                            len = -1;
                            break;
                        }
                        len = lps[len - 1];
                    }
                    lps[i] = len + 1;
                }
            }

            return lps;
        }
    }

}


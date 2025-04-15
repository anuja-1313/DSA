package Strings;

public class LongestPalindromeSubString {
    /*
5. Longest Palindromic Substring - Medium
TC: O(N^2) , main check logic
SC: O(N^2), n*n matrix for dp
*/
    class Solution {
        public String longestPalindrome(String s) {
            int n = s.length();
            if(n<2){
                return s; //1 length strings will always be palindrome
            }

            //DP
            boolean[][] dp = new boolean[n][n];
            int start = 0; //starting index of longest palindrome
            int maxLen = 1; //1 length strings will always be palindrome

            //dp[0][0], dp[1][1], dp[2][2], dp[3][3], dp[4][4] are true
            for(int i=0; i<n; i++){
                dp[i][i] = true; //all single characters are palindromes
            }

            //trying substrings from length 2-n
            for(int len = 2; len <= n; len++) //2,3,4,5
            {
                //We slide i from 0 up to the last place where a substring of length len can fit.
                for(int i=0; i <= n-len ; i++) //i=0,1,2,3 for len = 2, 5-2 = 3
                {
                    int j = i + len - 1; //where the sunstring ends
                    if(s.charAt(i) == s.charAt(j)){
                        //len==2, i and j are the only two characters in the string and they are equal
                        //dp[i+1][j-1] , everything between i and j is also a palindrome
                        if(len == 2 || dp[i+1][j-1])
                        {
                            dp[i][j] = true;

                            if(len > maxLen){
                                maxLen = len;
                                start = i;
                            }
                        }
                    }
                }
            }

            return s.substring(start, start + maxLen);

        }
    }
}

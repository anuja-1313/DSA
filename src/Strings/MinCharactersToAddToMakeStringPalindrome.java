package Strings;

public class MinCharactersToAddToMakeStringPalindrome {

    /*
Min Chars to Add for Palindrome - (Hard)
TC: O(N) , N-length of string
SC: O(N) , lps array
*/

    class Solution {
        public static int minChar(String s) {
            // Write your code here
            StringBuilder sb = new StringBuilder(s);
            sb.append("#"); //adding special character to string after og string elements
            //adding og string in reverse after special character
            for(int i=s.length()-1 ; i>=0; i--){
                sb.append(s.charAt(i));
            }

            String s1 = sb.toString();
            int lps = LPS(s1); //lps of last index of string s1
            return s.length() - lps; //number of charcters neede to be added to string to make palindrome
            //length of original string - lps of last index of new string
        }

        public static int LPS(String s1){
            int n = s1.length();
            int[] lps = new int[n];
            int len = 0; //lps[0] is 0 so starting from i=1 directly
            int i=1;

            while(i<n){
                if(s1.charAt(i) == s1.charAt(len)){
                    len++;
                    lps[i] = len;
                    i++;
                }
                else if(len != 0) //when len!=0 and s.charAt(i) != s.charAt(len)
                {
                    len = lps[len-1];
                }
                else //when len == 0 and s.charAt(i) != s.charAt(len)
                {
                    lps[i] = 0;
                    i++;
                }
            }
            return lps[n-1]; //returning lps of last index
        }
    }
}


package Strings;

public class StringToIntegerATOI {

/*
8. String to Integer (atoi) (Medium)
Time Complexity: O(N)
Space Complexity: O(1)
*/

    class Solution {
        public int myAtoi(String s) {
            // Trim whitespaces
            s = s.trim();

            // Empty string case
            if (s == null || s.length() == 0) {
                return 0;
            }

            int n = s.length();

            // Preserve signs
            boolean isNegative = false;
            if (s.charAt(0) == '-') {
                isNegative = true;
                s = s.substring(1);
            } else if (s.charAt(0) == '+') {
                s = s.substring(1);
            }

            if (s.length() == 0) {
                return 0;
            }

            // Remove leading zeroes
            s = noZero(s, n);
            if (s.length() == 0) {
                return 0;
            }

            // Check for characters
            double result = 0; //for really large values (larger than int or long)
            for(int i=0; i<s.length(); i++){
                //if character is not digit
                if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                    break;
                }
                int digit = (int)(s.charAt(i) - '0');
                result = result*10 + digit;
            }

            //preserve sign
            if(isNegative){
                result = result * -1;
            }

            //check range bound
            if(result > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            else if(result < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }

            //return integer
            return (int)result;

        }

        // Remove all leading zeroes
        String noZero(String s, int n) {
            int i = 0;
            // Loop until we find a non-zero character
            while (i < n && s.charAt(i) == '0') {
                i++;
            }
            // All characters are zero
            if (i == n) {
                return "0";
            }
            return s.substring(i);
        }
    }

}

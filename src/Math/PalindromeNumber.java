package Math;

public class PalindromeNumber {
    /*
9. Palindrome Number (Easy)
TC: O(log₁₀(x))
SC: O(1)
*/
    class Solution {
        public boolean isPalindrome(int x) {
            int x2 = x;
            int sum = 0;
            while(x2>0){
                int digit = x2 % 10;
                sum = sum * 10 + digit;
                x2 = x2 / 10;
            }
            if(sum == x){
                return true;
            }
            return false;
        }
    }
}

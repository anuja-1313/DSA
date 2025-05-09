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

/*
//Half Reverse
class Solution {
    public boolean isPalindrome(int x) {

        if(x<0 || x%10 == 0 && x != 0){return false;}
        int sum = 0;
        while(x > sum){
            sum = sum * 10 + x % 10;
            x /= 10;
        }
        if(x == sum || x == sum/10){
            return true;
        }
        return false;
    }
}
 */
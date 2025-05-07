package Recursion;

public class ReverseAString {
    /*
Using Recursion
344. Reverse String (Easy)
TC: O(N)
SC: O(N) due to recursion stack
*/
    class Solution {
        public void reverseString(char[] s) {
            //reverse first and last element
            //then recursively reverse the string between them
            reverse(s, 0, s.length-1);
        }
        void reverse(char[] s, int left, int right){
            if(left >= right){
                return;
            }
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            reverse(s, left+1, right-1);
        }
    }
}

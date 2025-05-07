package Recursion;

public class PowerOfTwo {
    /*
231. Power of Two (Easy)
TC: O(logN)
Sc: O(logN)
*/
    class Solution {
        public boolean isPowerOfTwo(int n) {
            if(n <= 0){return false;}
            if(n == 1){return true;}

            //recursively divide by 2 till we reach 1
            if( n%2 == 0 && isPowerOfTwo(n/2)){
                return true;
            }
            return false;
        }
    }
}

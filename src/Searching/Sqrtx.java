package Searching;

public class Sqrtx {
    /*

    69. Sqrt(x) - (Easy)
TC : O(logN)
SC : O(1)
*/

    class Solution {
        public int mySqrt(int x) {
            if(x < 2){ return x;}

            //if x  = 10
            int low = 1; //1
            int high = x; //10 , 1 to 10
            int ans = 0;
            while(low <= high){
                int m = low + (high-low)/2; //5

                long square = (long)m * m; //25

                if(square == x){
                    return m;
                }
                else if(square < x) //25 > 9 we need to try somthing smaller
                {
                    ans = m;
                    low = m + 1;
                }
                else{
                    high = m - 1; //going below m = 5
                }
            }
            return ans;
        }
    }
}


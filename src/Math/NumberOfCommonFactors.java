package Math;

public class NumberOfCommonFactors {
    /*
2427. Number of Common Factors
TC: O(min(a,b))
SC: O(1)
*/
    class Solution {
        public int commonFactors(int a, int b) {
            int count = 0;
            int min = a < b ? a : b;
            for(int i=1; i<=min; i++){
                if(a % i == 0 && b % i == 0){
                    count++;
                }
            }

            return count;
        }
    }
}

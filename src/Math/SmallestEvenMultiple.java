package Math;

public class SmallestEvenMultiple {
    /*
2413. Smallest Even Multiple - Easy
TC: O(1)
SC: O(1)
*/
    class Solution {
        public int smallestEvenMultiple(int n) {

            return n % 2 == 0? n : 2*n;
        }
    }

}

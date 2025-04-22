package Math;

public class CountOddNumbersInIntervalRange {
    /*
1523. Count Odd Numbers in an Interval Range (Easy)
TC: O(1)
SC: O(1)
*/
    class Solution {
        public int countOdds(int low, int high) {
            if(low % 2 != 0){
                return (high  - low)/2 + 1;
            }
            return (high - low + 1)/2;
        }
    }
}

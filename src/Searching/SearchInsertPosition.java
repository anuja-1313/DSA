package Searching;

public class SearchInsertPosition {
    /*
35. Search Insert Position
TC: O(logN)
SC: O(1)
*/
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int low = 0;
            int high = nums.length - 1;
            int ans = -1;

            while(low <= high){
                int m = low + (high-low)/2;

                if(nums[m] == target){
                    return m;
                }
                else if(nums[m] < target){
                    low = m + 1;
                }
                else {
                    high = m - 1;
                }
            }
            return low;
        }
    }
}

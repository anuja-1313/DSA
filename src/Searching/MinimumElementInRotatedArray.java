package Searching;

public class MinimumElementInRotatedArray {
    /*
153. Find Minimum in Rotated Sorted Array
TC: O(logN)
SC: O(1)
*/
    class Solution {
        public int findMin(int[] nums) {
            int low = 0;
            int high = nums.length - 1;

            while(low < high) //avoid infinite loop when low == high
            {
                int m = low + (high-low)/2;

                if(nums[m] > nums[high])
                {
                    low = m + 1; //ans lies on right side
                }
                else {
                    high = m; //ans on left side
                }
            }
            return nums[low]; //break loop when low == high
        }
    }
}
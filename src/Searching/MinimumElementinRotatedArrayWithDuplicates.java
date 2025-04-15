package Searching;

public class MinimumElementinRotatedArrayWithDuplicates {
    /*
154. Find Minimum in Rotated Sorted Array II
TC: O(logN) average case, O(N) - worst case when all array elements are same and we keep trimming
SC: O(1)
*/
    class Solution {
        public int findMin(int[] nums) {
            int low = 0;
            int high = nums.length - 1;

            while(low < high) //break out of loop when low == high
            {
                int m = low + (high - low)/2;

                //trim array to get to sorted side
                if(nums[m] == nums[low] && nums[m] == nums[high]){
                    low++;
                    high--;
                }
                else if(nums[m] > nums[high]){
                    low = m + 1; //ans lies on right
                }
                else {
                    high = m; //ans lies on left
                }
            }

            return nums[low]; //since low == high return one of those
        }
    }
}


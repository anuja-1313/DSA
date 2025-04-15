package Searching;


public class SearchInRotatedArray {
    /*
33. Search in Rotated Sorted Array
TC: O(logN)
SC: O(1)
*/
    class Solution {
        public int search(int[] nums, int target) {
            int low = 0;
            int high = nums.length - 1;

            while(low <= high){
                int m = low + (high-low)/2;

                if(nums[m] == target){
                    return m;
                }
                else if(nums[m] <= nums[high]){
                    if(target >= nums[m] && target <= nums[high]){
                        low = m + 1;
                    }
                    else {
                        high = m - 1;
                    }
                }
                else {
                    if(target >= nums[low] && target <= nums[m]){
                        high = m - 1;
                    }
                    else {
                        low = m + 1;
                    }

                }
            }

            return -1;
        }
    }
}


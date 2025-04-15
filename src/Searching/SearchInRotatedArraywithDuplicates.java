package Searching;


public class SearchInRotatedArraywithDuplicates {
    /*
81. Search in Rotated Sorted Array II
TC: O(logN) average case
O(N) worst case - example [4,4,4,......4,4,4] target = 5, we will never find the target,
we keep trimming array till while condition is true
SC: O(1)
*/
    class Solution {
        public boolean search(int[] nums, int target) {
            int low = 0;
            int high = nums.length - 1;

            while(low <= high){
                int m = low + (high - low)/2;

                if(nums[m] == target){
                    return true;
                }

                //trim the ends and move towards m to check which side is sorted
                if(nums[m] == nums[low] && nums[m] == nums[high]){
                    low++;
                    high--;
                }
                else if(nums[m] <= nums[high]) //right side m-high is sorted
                {
                    if(target >= nums[m] && target <= nums[high]){
                        low = m + 1;
                    }
                    else {
                        high = m - 1;
                    }
                }
                else //left side low-m is sorted
                {
                    if(target >= nums[low] && target <= nums[m]){
                        high = m - 1;
                    }
                    else {
                        low = m + 1;
                    }
                }
            }

            return false;
        }
    }
}


package Searching;

public class FirstAndLastPositionOfElement {
    /*
34. Find First and Last Position of Element in Sorted Array
TC: O(logN)
SC: O(1)
*/
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int first = findOccurences(nums, target, true); //searching left side
            int last = findOccurences(nums, target, false); //seraching right side
            return new int[] {first, last};
        }

        public int findOccurences(int[] nums, int target, boolean isFirst){
            int low = 0;
            int high = nums.length - 1;
            int found = -1;

            while(low <= high){
                int m = low + (high-low)/2;

                if(target == nums[m]){
                    found = m; //storing occurence
                    if(isFirst) //searching left side in case we have more occurences
                    {
                        high = m - 1;
                    }
                    else //searching right side for more occurences since left has none
                    {
                        low = m + 1;
                    }
                }
                else if(nums[m] < target){
                    low = m + 1;
                }
                else {
                    high = m - 1;
                }
            }

            return found;
        }

    }
}


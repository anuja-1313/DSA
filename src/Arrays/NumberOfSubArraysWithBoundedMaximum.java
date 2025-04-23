package Arrays;

public class NumberOfSubArraysWithBoundedMaximum {
/*
795. Number of Subarrays with Bounded Maximum - Medium
TC: O(N)
SC: O(1)
*/
    class Solution {
        public int numSubarrayBoundedMax(int[] nums, int left, int right) {
            //optimal approach
            int lgei = 0; //last greater element index
            int previousCount = 0; //how many valid subarrays ended at the previous index
            int ans = 0;

            for(int i=0; i<nums.length; i++){
                if(nums[i] > right) //invalid subarray
                {
                    lgei = i+1;
                    ans = ans + 0; //contribute nothing to answer
                    previousCount = 0;
                    //reset previous count as we dont want this index included in subarray
                }
                else if(nums[i] >= left && nums[i] <= right) //valid subarray
                {
                    //add everything between i and lgei (included)
                    ans = ans + (i - lgei + 1);
                    //Update previousCount to this value for use in future iterations.
                    previousCount = i - lgei + 1;
                }
                else //nums[i] < left
                {
                    //This element can't be the max, but it can be part of a subarray if a valid max came before.
                    //so even when nums[i] < left as long as the subarray has max in [left, right] this answer is valid
                    ans = ans + previousCount;
                }
            }

            return ans;
        }
    }
}

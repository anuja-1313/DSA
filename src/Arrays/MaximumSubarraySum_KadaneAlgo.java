package Arrays;

public class MaximumSubarraySum_KadaneAlgo {
/*
53. Maximum Subarray (Medium)
Kadane's Algo - Maximum subarray sum
TC: O(N)
SC: O(1)
*/
    class Solution {
        public int maxSubArray(int[] nums) {
            int maxSum = Integer.MIN_VALUE;
            int currSum = 0;
            int n = nums.length;
            for(int i=0; i<n; i++){
                if(currSum >= 0){
                    currSum = currSum + nums[i];
                }
                else{
                    //if the current sum becomes negative, it won't help future subarrays, so we drop it and start fresh.Otherwise, we try to extend the subarray.
                    currSum = nums[i];
                }
                maxSum = Math.max(maxSum, currSum);
            }

            return maxSum;
        }
    }
/*
class Solution {
    public int maxSubArray(int[] nums) {
       int sum = 0, max = nums[0];
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = (sum > max) ? sum : max;
            if(sum < 0) sum = 0;
        }
        return max;

    }
}
*/
}

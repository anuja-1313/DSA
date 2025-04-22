package Arrays;

public class RunningSumOf1DArray {
    /*
1480. Running Sum of 1d Array - Easy
TC: O(N)
SC: O(N)
*/
    class Solution {
        public int[] runningSum(int[] nums) {
            //runningSum is prefix sum
            int[] prefixSum = new int[nums.length];
            prefixSum[0] = nums[0];
            for(int i=1; i<prefixSum.length; i++){
                prefixSum[i] = prefixSum[i-1] + nums[i];
            }

            return prefixSum;
        }
    }
}

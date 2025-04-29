package Arrays;

public class MaxCircularSubarraySum {
/*
918. Maximum Sum Circular Subarray (Medium)
TC: O(N)
SC: O(1)
*/
    class Solution {
        public int maxSubarraySumCircular(int[] nums) {
            int n = nums.length;
            //Step 1: Kadane for linear array max sub array sum
            int kadaneSum = kadane(nums, n);

            //Step 2: Calculate totalSum and invert array
            int totalSum = 0;
            for(int i=0; i<n; i++){
                totalSum += nums[i];
                nums[i] = -nums[i];
            }

            //Step 3: calculate minSubArraySum
            int minsubArraySum = kadane(nums, n); //kadane on inverted

            //Step 4: get rid of the worst elements to create maxCircular
            int maxCircular = totalSum + minsubArraySum;

            //Step 5: return best of maxCircular and KadaneSum
            //when all elements are -ve, KadaneSum is larger than maxCircular
            if(maxCircular == 0){
                return kadaneSum;
            }

            //ex - [1,-2,3,-2], maxCircular = 2, KadaneSum = 3
            return Math.max(maxCircular, kadaneSum);

        }

        int kadane(int[] nums, int n){
            int maxSum = Integer.MIN_VALUE;
            int currSum = 0;
            for(int i=0; i<n; i++){
                if(currSum >= 0){
                    currSum += nums[i];
                }
                else{
                    currSum = nums[i];
                }
                maxSum = Math.max(maxSum, currSum);
            }
            return maxSum;
        }
    }
}

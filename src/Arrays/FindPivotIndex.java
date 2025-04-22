package Arrays;

public class FindPivotIndex {
/*
724. Find Pivot Index - Easy
TC: O(N) , iterate through nums array
SC: O(N) , prefix array
*/
    class Solution {
        public int pivotIndex(int[] nums) {
            int pf[] = prefixsum(nums);
            int n = nums.length;

            for(int i=0; i<n; i++){
                int leftsum = (i > 0) ? pf[i-1] : 0; //handling for 0th index as well
                int rightsum = pf[n-1] - pf[i];

                if(leftsum == rightsum){
                    return i;
                }
            }

            return -1;
        }

        int[] prefixsum(int[] nums){
            int[] pf = new int[nums.length];
            pf[0] = nums[0];
            for(int i=1; i<pf.length; i++){
                pf[i] = pf[i-1] + nums[i];
            }
            return pf;
        }
    }
}

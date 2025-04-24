package Arrays;

public class ProductOfArrayExceptSelf {
    /*
238. Product of Array Except Self (Medium)
TC: O(N)
SC: O(1), prefixProd used as output
*/
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] prefixProd = new int[n];
            prefixProd[0] = nums[0];

            //making a prefix product array
            //to get left side elements product
            for(int i=1; i<n; i++){
                prefixProd[i] = prefixProd[i-1] * nums[i]; //[1,2,6,24]
            }

            int suffix = 1;
            //for right side elements product
            for(int i=n-1; i>0; i--) //dont go to i=0, ArrayIndexOutOfBound
            {
                prefixProd[i] = prefixProd[i-1] * suffix;
                suffix = suffix * nums[i];
            }

            //for 0th index
            prefixProd[0] = suffix;

            return prefixProd;
        }
    }
}

package Arrays;

public class RainWaterTrapping {
/*
42. Trapping Rain Water (Hard)
TC: O(N)
SC: O(N), prefix and suffix max arrays
*/
    class Solution {
        public int trap(int[] height) {
            int n = height.length;
            int[] prefixMax = prefixmax(height); //keep track of left most
            int[] suffixMax = suffixmax(height); //keep track of right most
            int amount = 0;

            //not going to 0th or n-1th element as those walls wont hold any water
            for(int i=1; i<n-1; i++){
                int leftBound = prefixMax[i-1];
                int rightBound = suffixMax[i+1];
                //choosing lower value so water doesn't escape
                int finalBound = Math.min(leftBound, rightBound);
                int contribution = finalBound - height[i];

                if(contribution > 0){
                    amount = amount + contribution;
                }
            }

            return amount;
        }

        public int[] prefixmax(int[] height){
            int n = height.length;
            int result[] = new int[n];
            result[0] = height[0];

            for(int i=1; i<n; i++){
                result[i] = Math.max(height[i], result[i-1]);
            }
            return result;
        }

        public int[] suffixmax(int[] height){
            int n = height.length;
            int result[] = new int[n];
            result[n-1] = height[n-1];

            for(int i = n-2; i>=0; i--){
                result[i] = Math.max(height[i], result[i+1]);
            }
            return result;
        }
    }
}

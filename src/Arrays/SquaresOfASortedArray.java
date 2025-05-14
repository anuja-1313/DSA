package Arrays;

public class SquaresOfASortedArray {
    //977. Squares of a Sorted Array (Easy)
//Two pointers - TC: O(N), SC: O(N)
    class Solution {
        public int[] sortedSquares(int[] nums) {
            int n = nums.length;
            int left = 0;
            int right = n-1;
            int point = n-1;
            int[] result = new int[n];

            while(left <= right){
                int rightSQ = nums[right] * nums[right];
                int leftSQ = nums[left] * nums[left];

                if(leftSQ > rightSQ){
                    result[point] = leftSQ;
                    point--;
                    left++;
                }
                else{
                    result[point] = rightSQ;
                    point--;
                    right--;
                }
            }
            return result;
        }
    }
}

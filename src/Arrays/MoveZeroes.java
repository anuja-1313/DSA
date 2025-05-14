package Arrays;

public class MoveZeroes {
    //283. Move Zeroes (Easy)
//Time: O(N)
//Space : O(1)
    class Solution {
        public void moveZeroes(int[] nums) {
            int n = nums.length;
            int j =0;
            for(int i=0; i<n; i++){
                if(nums[i] != 0){
                    if(i != j){
                        swap(nums, i, j);
                    }
                    j++;
                }
            }
        }
        void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}

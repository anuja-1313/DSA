package Sorting;

public class NextPermutation {

    /*
    31. Next Permutation - (Medium)
    Time Complexity: O(N)
    Space Complexity: O(1)
    */
    class Solution {
        public void nextPermutation(int[] nums) {
            int n = nums.length;

            //step 1: find a dip in the sequence
            int i = n-2;
            while(i>=0 && nums[i] >= nums[i+1]){
                i--;
            }

            //step 2: find next bigger element on the right after i
            if(i>=0){
                int j = n-1;
                while(nums[j] <= nums[i]){
                    j--;
                }

                //step 3: swap i and j
                swap(nums, i, j);
            }

            //step 4: reverse everything on right after new i (since it will already be sorted)
            reverse(nums, i+1, n-1);

        }

        public void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        public void reverse(int[] nums, int start, int end){
            while(start < end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    }

}

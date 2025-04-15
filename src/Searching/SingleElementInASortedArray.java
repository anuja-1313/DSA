package Searching;

public class SingleElementInASortedArray {
    /*
540. Single Element in a Sorted Array
TC: O(logN)
SC: O(1)
*/
    class Solution {
        public int singleNonDuplicate(int[] nums) {
            int low = 0;
            int high = nums.length - 1;

            while (low < high) {
                int m = low + (high - low) / 2;

                if (m % 2 == 1) {
                    m--; // make sure m is even
                }

                if (nums[m] == nums[m + 1])
                {
                    low = m + 2;
                } else {
                    high = m;
                }
            }

            return nums[low];
        }
    }

}

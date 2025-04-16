package Sorting;

import java.util.List;

public class CountOfSmallerNumbersAfterSelf {

    /*
315. Count of Smaller Numbers After Self - Hard
Time: O(N log N)
Space: O(N)
*/
    class Solution {
        public List<Integer> countSmaller(int[] nums) {
            //merge sort modified

            int n = nums.length;
            Integer[] indices = new Integer[n];
            Integer[] counts = new Integer[n];

            for(int i=0; i<n; i++){
                indices[i] = i;
                counts[i] = 0;
            }

            mergeSort(nums, indices, counts, 0, n-1);

            return Arrays.asList(counts);
        }

        public void mergeSort(int[] nums, Integer[] indices, Integer[] counts, int left, int right){
            if(left >= right){
                return;
            }

            int mid = left + (right-left)/2;

            mergeSort(nums, indices, counts, left, mid); //sort left
            mergeSort(nums, indices, counts, mid+1, right); //sort right

            merge(nums, indices, counts, left, mid, right);
        }

        public void merge(int[] nums, Integer[] indices, Integer[] counts, int left, int mid, int right){
            Integer[] temp = new Integer[right-left+1];
            int p1 = left;
            int p2 = mid+1;
            int p3 = 0;
            int rightCount = 0; //tracking how many smaller elements we have passed from right

            while(p1<=mid && p2<=right){
                if(nums[indices[p1]] > nums[indices[p2]]){
                    temp[p3] = indices[p2];
                    p3++; p2++;
                    rightCount++;
                }
                else{
                    counts[indices[p1]] += rightCount;
                    temp[p3] = indices[p1];
                    p3++; p1++;
                }
            }

            while(p1<=mid){
                counts[indices[p1]] += rightCount;
                temp[p3] = indices[p1];
                p3++; p1++;
            }

            while(p2<=right){
                temp[p3] = indices[p2];
                p3++; p2++;
            }

            System.arraycopy(temp, 0, indices, left, temp.length);
        }
    }
}

package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnarrayConstantSpace {
    /*
442. Find All Duplicates in an Array - Medium
TC: O(N)
SC: O(1)
*/
    class Solution {
        public List<Integer> findDuplicates(int[] nums) {
            List<Integer> result = new ArrayList<>();
            for(int i=0; i<nums.length; i++){
                //get index based on value
                //only works for 1 - n value, indexes from 0 - n-1
                int index = Math.abs(nums[i]) - 1;

                if(nums[index] < 0){
                    //second occurrence detected
                    result.add(Math.abs(nums[i]));
                }
                else{
                    //flip the value at index - first detection
                    nums[index] = -nums[index];
                }
            }
            return result;
        }
    }
}

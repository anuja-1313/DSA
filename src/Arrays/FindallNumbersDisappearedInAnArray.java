package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindallNumbersDisappearedInAnArray {

//Alter of 442
/*
448. Find All Numbers Disappeared in an Array - Easy
TC: O(n)
SC: O(1) — excluding the output list
*/
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            List<Integer> result = new ArrayList<>();

            for(int i=0; i<nums.length; i++){
                int index = Math.abs(nums[i]) - 1;

                if(nums[index] > 0){
                    nums[index] = -nums[index];
                }

            }

            for(int i=0; i<nums.length; i++){
                if(nums[i] > 0){
                    result.add(i+1);
                }
            }

            return result;
        }
    }
}

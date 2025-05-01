package Arrays;

public class ThirdMaximumNumber {

/*
414. Third Maximum Number (Easy)
TC: O(N)
SC: O(1)
*/
    class Solution {
        public int thirdMax(int[] nums) {
            //using long in case array itself contains Integer.MIN_VALUE as element
            long num1 = Long.MIN_VALUE;
            long num2 = Long.MIN_VALUE;
            long num3 = Long.MIN_VALUE;

            for(int i=0; i<nums.length; i++){
                if(nums[i] > num1){
                    num3 = num2;
                    num2 = num1;
                    num1 = nums[i];
                }
                else if(nums[i] > num2 && nums[i] < num1){
                    num3 = num2;
                    num2 = nums[i];
                }
                else if(nums[i] > num3 && nums[i] < num2){
                    num3 = nums[i];
                }
            }
            if(num3 == Long.MIN_VALUE){
                return (int)num1;
            }
            return (int)num3;
        }
    }

}

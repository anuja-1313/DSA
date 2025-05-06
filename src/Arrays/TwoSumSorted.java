package Arrays;

public class TwoSumSorted {
/*
167. Two Sum II - Input Array Is Sorted (Medium)
TC: O(N)
SC: O(1)
either sompare sum of two nums or diff of two
*/
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int n = numbers.length;
            int start = 0; //2
            int end = n-1; //15
            while(start < end){
                int diff = target - numbers[start]; //9-2=7
                if(diff == numbers[end]){
                    return new int[] {start+1, end+1};
                }
                else if(diff < numbers[end]){
                    end--;
                }
                else{
                    start++;
                }
            }
            return new int[] {};
        }
    }
}

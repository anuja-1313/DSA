package Searching;
import java.util.*;

public class FindKthSmallestPairDistance {

    /*
    719. Find K-th Smallest Pair Distance - Hard
    TC: O(NlogN) , sorting the array = nlogn, binary search - O(nlog(max-min))
    SC: O(1)
    */
    class Solution {
        public int smallestDistancePair(int[] nums, int k) {
            int min = 0; //[1,3,1] , 1-1 = 0
            int max = Arrays.stream(nums).max().getAsInt(); //3
            int n = nums.length;

            Arrays.sort(nums);

            while(min <= max){
                int mid = min + (max-min)/2;

                int count = countPairs(nums, mid);

                if(k > count){
                    min = mid + 1;
                }
                else{
                    max = mid - 1;
                }
            }

            return min;
        }

        //finding how many pairs differenece is <= mid, to check whether mid is kth
        public int countPairs(int[] nums, int mid){
            int count = 0;
            int left = 0;
            for(int right = 0; right < nums.length; right++){
                while(nums[right] - nums[left] > mid){
                    left++;
                }
                count += right - left;
            }
            return count;
        }
    }
}

package Arrays;

public class MinimumSwapsKTogether {
/*
Minimum swaps and K together (Medium)
TC: O(N)
SC: O(1)
*/
    class Solution {
        // Function for finding maximum and value pair
        int minSwap(int[] arr, int k) {
            //sliding window
            int n = arr.length;
            int count = 0;
            //Step 1: count the number of elements lesser than equal to k
            for(int i=0; i<n; i++){
                if(arr[i] <= k){
                    count++;
                }
            }

            //Step 2: count number of elements > k in window, that will give us the swaps
            //Window 1
            int swap = 0;
            int minSwap = Integer.MAX_VALUE;
            for(int i=0; i<count; i++){
                if(arr[i] > k){
                    swap++;
                }
            }
            minSwap = swap;

            //Step 3: create a window with the count
            //using i as start, j as end
            //Step 4: Slide the window, take minimum swaps in account
            for(int i=0, j=count; j < n; i++, j++){
                if(arr[i] > k){ swap--; } //going out number
                if(arr[j] > k){ swap++; } //going in number
                minSwap = Math.min(minSwap, swap);
            }

            return minSwap;

        }
    }

}

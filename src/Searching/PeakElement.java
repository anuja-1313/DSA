package Searching;

public class PeakElement {
    /*
162. Find Peak Element (Medium)
TC - O(logN)
SC - O(1)
*/

    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while(low < high){
            int m = low + (high-low)/2;

            if(nums[m] > nums[m+1]) //descending slope, peak has to be on left
            {
                high = m; //peak could be at mid itself, so not skipping mid
            }
            else{
                //when n[m] < n[m+1] - ascending slope
                //m definitely not the peak as it is smaller than m+1
                low = m + 1;
            }
        }
        return low; //when low == high, we are at peak
    }
}


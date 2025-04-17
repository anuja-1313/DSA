package Searching;

public class KthSmallestNumberInMultiplicationTable {

    /*
    668. Kth Smallest Number in Multiplication Table - (Hard)
    TC: O(m × log(m × n)), For each mid, we iterate over all m rows → O(m)
    SC: O(1)
    */
    class Solution {
        public int findKthNumber(int m, int n, int k) {
            int left = 1 * 1;
            int right = m * n; //3*3 //2*3

            while(left < right){
                int mid = left + (right - left)/2;

                int count = countMul(m, n, mid);

                if(k > count){
                    left = mid + 1;
                }
                else{
                    right = mid;
                }
            }

            return left;
        }

        public int countMul(int m, int n, int mid){
            int count = 0;
            for(int i = 1; i<=m; i++){
                count += Math.min((mid/i), n); //i*j <= mid, j <= mid/i and j can only go upto n
            }
            return count;
        }
    }

}

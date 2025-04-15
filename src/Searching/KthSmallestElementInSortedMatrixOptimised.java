package Searching;

public class KthSmallestElementInSortedMatrixOptimised {
    /*
378. Kth Smallest Element in a Sorted Matrix
TC: O(n*log(max-min))
SC: O(1)
*/
    class Solution {
        public int kthSmallest(int[][] matrix, int k) {
            int n = matrix.length;
            int low = matrix[0][0];
            int high = matrix[n-1][n-1];

            while(low < high){
                int mid = low + (high-low)/2;

                int countNums = countLessOrEqual(matrix, mid);

                if(countNums < k){
                    low = mid + 1;
                }
                else{
                    high = mid;
                }
            }
            return low;
        }

        public int countLessOrEqual(int[][] matrix, int mid){
            int n = matrix.length;
            int i = n-1; //2
            int j = 0;
            int count = 0;

            while(i>=0 && j<n){
                if(matrix[i][j] <= mid){
                    count += (i+1);
                    j++;
                }
                else {
                    i--;
                }
            }
            return count;
        }
    }

}


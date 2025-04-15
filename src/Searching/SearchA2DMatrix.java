package Searching;

public class SearchA2DMatrix {
    /*
74. Search a 2D Matrix
TC: O(log(n*m))
SC: O(1)
*/
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            //need to visualise this into a 1D array
            int n = matrix.length; //3
            int m = matrix[0].length; //4
            int low = 0;
            int high = (n*m) - 1; //12-1 = 11, so from 0-11

            while(low <= high){
                int mid = low + (high - low)/2; //5
                int r = mid / m; // 5/4 = 1
                int c = mid % m; // 5%4 = 1 , so index (1,1)

                if(matrix[r][c] == target){
                    return true;
                }
                else if(matrix[r][c] < target){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }

            }

            return false;
        }
    }
}


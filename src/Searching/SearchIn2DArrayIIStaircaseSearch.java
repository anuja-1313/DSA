package Searching;

public class SearchIn2DArrayIIStaircaseSearch {
    /*
240. Search a 2D Matrix II
Staircase or Z-Search
TC: O(n+m) , i++ till n, j-- till m
SC: O(1)
*/
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            //elemsts sorted column wise, starting element of one column graeter than previous one
            //need to check row and adjoining column - 1,4,7,11,15,19,22,24,30
            int i = 0; //0
            int j = matrix[0].length - 1; //4 , so starting at (0,4) row 1 end

            while(i < matrix.length && j>=0) //break loop when indexes go out of bound
            {

                if(matrix[i][j] == target){
                    return true;
                }
                else if(matrix[i][j] < target){
                    i++; //for bigger element go down by a row
                }
                else {
                    j--; //for smaller element go left by a column
                }
            }

            return false;
        }
    }
}


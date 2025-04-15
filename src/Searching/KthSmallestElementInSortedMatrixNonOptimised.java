package Searching;

public class KthSmallestElementInSortedMatrixNonOptimised {
    /*
378. Kth Smallest Element in a Sorted Matrix
TC: O(N * M * log(max - min))
SC: O(1)

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length; //3
        int m = matrix[0].length; //3
        int low = Arrays.stream(matrix).flatMapToInt(Arrays::stream).min().getAsInt(); //1
        int high = Arrays.stream(matrix).flatMapToInt(Arrays::stream).max().getAsInt(); //15
        //binary search range 1-15

        while(low <= high){
            int mid = low + (high - low)/2; //8

            int countLess = 0;
            int countEqual = 0;
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(matrix[i][j] < mid){
                        countLess++;
                    }
                    else if(matrix[i][j] == mid){
                        countEqual++;
                    }
                }
            }

            if(countLess < k && (countLess + countEqual) >= k){
                return mid;
            }
            else if(countLess >= k){
                high = mid - 1;
            }
            else if(countLess < k && (countLess + countEqual < k)){
                low = mid + 1;
            }

        }

        return -1;

    }
}

*/
}


package Arrays;

/*
Sum of all Submatrices of a Given Matrix
Time Complexity: O(N^2)
Space Complexity: O(1)
 */
public class SumOfAllSubMatrices {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(matrixSum(matrix));
    }
    static int matrixSum(int[][] matrix){
        int n = matrix.length;
        int result = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                //number of ways to choose top left corner
                int topLeft = (i+1) * (j+1);
                //number of ways to choose bottom right corner
                int bottomRight = (n-i) * (n-j);

                //current element contribution
                result = result + (topLeft * bottomRight * matrix[i][j]);
            }
        }

        return result;
    }
}

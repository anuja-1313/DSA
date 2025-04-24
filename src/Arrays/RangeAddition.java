package Arrays;
import java.util.*;

public class RangeAddition {

    public class Solution {

/*
TC: O(N+K), N = length, K = rows of updates matrix
SC: O(1)
 */

        public int[] getModifiedArray(int length, int[][] updates) {
            // Write your code here
            int[] arr = new int[length];
            Arrays.fill(arr, 0);
            int a = updates.length; //rows

            for(int i=0; i<a; i++){
                int[] update = updates[i];
                int start = update[0];
                int end = update[1];
                int inc = update[2];

                arr[start] += inc;
                if((end + 1) < length){
                    arr[end + 1] -= inc;
                }
            }

            //prefix sum to balance out the increments/decrements
            for(int i=1; i<length; i++){
                arr[i] = arr[i] + arr[i-1];
            }

            return arr;
        }
    }

}

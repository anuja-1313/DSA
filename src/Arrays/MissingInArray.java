package Arrays;

import java.util.Arrays;

public class MissingInArray {
    /*
   Missing in Array (GFG) - Easy
   TC: O(N)
   SC: O(1)
   */
    class Solution {
        int missingNumber(int arr[]) {
            // code here
            Arrays.sort(arr);

            for(int i=0; i<arr.length; i++){
                if((i+1) != arr[i])
                {
                    return i+1;
                }
            }

            return arr[arr.length - 1] + 1;
        }
    }

}
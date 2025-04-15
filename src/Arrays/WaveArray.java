package Arrays;

public class WaveArray {
    /*
Wave Array(GFG) - Easy
Time Complexity: O(N)
Space Complexity: O(1)
*/

    class Solution {
        public static void convertToWave(int[] arr) {
            // code here
            int n = arr.length;
            for(int i=0; i<n-1; i=i+2){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }
}

package Arrays;

public class EquilibriumPoint {
    /*
Equilibrium Point (GFG) - Easy
TC: O(N)
SC: O(N)
*/
    class Solution {
        // Function to find equilibrium point in the array.
        public static int findEquilibrium(int arr[]) {
            int n = arr.length;
            // code here
            int[] prefixArray = prefix(arr,n);
            int[] suffixArray = suffix(arr,n);

            for(int i=0; i<n; i++){
                if(prefixArray[i] == suffixArray[i]){
                    return i;
                }
            }

            return -1;
        }

        public static int[] prefix(int[] arr, int n){
            int[] prearr = new int[n];
            prearr[0] = arr[0];
            for(int i=1; i<n; i++){
                prearr[i] = prearr[i-1] + arr[i];
            }

            return prearr;
        }

        public static int[] suffix(int[] arr, int n){
            int[] sufarr = new int[n];
            sufarr[n-1] = arr[n-1];
            for(int i=n-2; i>=0; i--){
                sufarr[i] = sufarr[i+1] + arr[i];
            }
            return sufarr;
        }
    }

}
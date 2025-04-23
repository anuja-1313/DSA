package Arrays;

import java.util.Scanner;

public class SumOfSubarrays {
/*
SumofSubarrays - Contribution technique
TC: O(N)
SC: O(1)
*/

    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            System.out.println(sumSubArray(arr));
        }

        static int sumSubArray(int[] arr){
            int n = arr.length;
            int sum = 0;

            for(int i=0; i<n; i++){
                //valid starting points * valid ending points
                //valid starting points = 0  to i ie i-0+1 = i+1
                //valid ending points = i to n-1 ie n-1-i+1 = n-i
                int occurrences = (i+1) * (n-i);

                sum += occurrences * arr[i];
            }

            return sum;
        }
    }
}

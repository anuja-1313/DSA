package Sorting;

import java.util.Arrays;

/*
https://www.geeksforgeeks.org/sum-manhattan-distances-pairs-points/
TC: O(nlogn) - Due to sorting the array
SC: O(1)
 */
public class ManhattanDistancePairSum {
    public static void main(String[] args) {
        int[] x = { -1, 1, 3, 2 };
        int[] y = { 5, 6, 5, 3 };
        int n = x.length;

        System.out.println(totalSum(x, y, n));
    }

    static int totalSum(int[] x, int[] y, int n){

        return distanceSum(x, n) + distanceSum(y , n); //22
    }

    static int distanceSum(int[] a, int n){

        Arrays.sort(a); //sorted input + prefix sum = we wont need to use Math.abs

        int sum = 0;
        int result = 0;
        for(int i=0; i<n; i++){
            //subtracting prefix sum
            result += (a[i]*i - sum); //result += (xi-x0) + (xi-x1) .... (xi - xi-1) --> result += (i*xi) - (x0+x1...+xi-1)
            sum = sum + a[i]; //prefix sum
        }
        return result;
    }
}

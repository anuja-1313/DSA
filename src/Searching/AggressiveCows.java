package Searching;

import java.util.Arrays;

public class AggressiveCows {
    /*
Aggressive Cows GFG - https://www.geeksforgeeks.org/problems/aggressive-cows/0
Time Complexity: O(N log N) (Sorting + Binary Search)
Space Complexity: O(1) (No extra storage used)
*/

    // User function Template for Java

    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);

        int low = 1;//starting from 1 so we get to check all valid minimum distances
        int high = distance(stalls);//distance between first and last stall
        int ans = 0;


        while(low <= high){
            int m = low + (high-low)/2;
            int reqCows = calculate(stalls, m);

            if(reqCows >= k)//making sure atleast k cows are placed
            {
                ans = m;
                low = m + 1; //try for maximising minimum distance
            }
            else{
                high = m - 1;//if k cows arent placed reduce distance
            }
        }
        return ans;
    }

    //distance between first and last stall
    public static int distance(int[] stalls){
        int n = stalls.length;
        return stalls[n-1] - stalls[0];
    }
    //calculate how many cows can be placed atleast m distance apart
    public static int calculate(int[] stalls, int m){
        int lastCow = stalls[0];
        int cows = 1; //placing first cow at stalls[0]

        for(int i=1; i<stalls.length; i++){
            if(stalls[i]-lastCow >= m)//placing a cow if we are atleat 'm' distance apart
            {
                cows++;
                lastCow = stalls[i]; //updating last placed cows position
            }
        }
        return cows;
    }
}


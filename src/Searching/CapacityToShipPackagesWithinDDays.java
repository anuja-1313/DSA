package Searching;

public class CapacityToShipPackagesWithinDDays {
    /*
1011. Capacity To Ship Packages Within D Days (Medium)
TC - O(N * log(S))
Where:
N = number of weights
S = sum of weights (since that’s the max value high could be)

SC - O(1)
*/
    class Solution {
        public int shipWithinDays(int[] weights, int days) {
            int low = maxWeight(weights); //maximum weight
            int high = sumWeights(weights);//sum of all weights
            int ans = 0;

            while(low <= high){
                int m = low + (high-low)/2;
                int reqDays = calculate(weights, m);

                if(reqDays <= days){
                    ans = m;
                    high = m - 1;
                }
                else{
                    low = m + 1;
                }
            }
            return ans;
        }
        //maximum weights
        public int maxWeight(int[] weights){
            int max = weights[0];
            for(int i=1; i<weights.length; i++){
                if(max < weights[i]){
                    max = weights[i];
                }
            }
            return max;
        }
        //sum all weights
        public int sumWeights(int[] weights){
            int sum = 0;
            for(int i=0; i<weights.length; i++){
                sum = sum + weights[i];
            }
            return sum;
        }
        //calculate required days for each value of m
        public int calculate(int[] weights, int m){
            int sum = 0;
            int day = 1;
            for(int w : weights){
                if(sum + w > m){
                    day++;
                    sum = w;
                }
                else{
                    sum = sum + w;
                }
            }
            return day;
        }
    }

}


package Searching;

public class NthMagicalNumber {
    /*
Wait..Ugly Number III is this you?!
878. Nth Magical Number
TC: O(log(n * min(a,b)))
SC: O(1)
*/
    class Solution {
        public int nthMagicalNumber(int n, int a, int b) {
            long mod = 1000000007;
            long low = 1;
            long high = (long)n * Math.min(a, b);

            while(low < high){
                long mid = low + (high-low)/2;

                long count = mid/a + mid/b - mid/lcm(a,b);

                if(count < n){
                    low = mid + 1;
                }
                else {
                    high = mid;
                }

            }

            return (int)(low % mod);
        }

        public long lcm(long a, long b){
            return (a*b)/gcd(a,b);
        }
        public long gcd(long a, long b){
            return b == 0 ? a : gcd(b, a%b); //Euclidean principle
        }
    }
}

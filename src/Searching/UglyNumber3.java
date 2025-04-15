package Searching;


public class UglyNumber3 {
    /*
1201. Ugly Number III
TC: O(log(n × min(a, b, c))), high = n × min(a, b, c) ← safe upper bound
SC: O(1)
*/
    class Solution {
        public int nthUglyNumber(int n, int a, int b, int c) {
            //binary serach and inclusion exclusion principle
            //we need to find how many numbers smaller than number at n are divisible by a ,b or c
            int low = 1;
            long high = n * Math.min(a, Math.min(b ,c)); //highest upper bound
        /*
        worst case - all ugly numbers are coming from multiples of smallest value
        n=100000000, a=1, b=1, c=1 - nth ugly number here is 1000000000 = 1*1000000000
        */

            while(low < high){
                int mid = low + (int)(high-low)/2;

                //aUbUc = a + b + c - a(intersection)b - a(intersection)c - b(intersection)c + a(intersection)b(intersection)c
                long ab = lcm(a, b);
                long ac = lcm(a, c);
                long bc = lcm(b, c);
                long abc = lcm(a, lcm(b, c));
                long count = mid/a + mid/b + mid/c - mid/ab - mid/bc - mid/ac + mid/abc;

                if(count < n){
                    low = mid + 1;
                }
                else{
                    high = mid;
                }
            }

            return (int)low;

        }
        public long lcm(long a, long b){
            return (a*b)/gcd(a,b);
        }
        public long gcd(long a, long b){
            return b == 0 ? a : gcd(b, a % b);
        }
    }
}


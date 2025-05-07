package Recursion;

public class PowXN {
/*
50. Pow(x, n) (Medium)
TC: O(logN), divide n by 2 in each step
SC: O(logN), recursive call stack
*/
    class Solution {
        public double myPow(double x, int n) {
            return pow(x, (long)n);
        }

        double pow(double x, long n){
            //base case
            if(n==0){
                return 1;
            }

            //when n is -ve
            if(n < 0){
                x = 1/x;
                n = -n;
            }

            double temp = pow(x, n/2);
            if(n%2 == 0){
                return temp * temp;
            }
            return temp * temp * x;
        }
    }
}

package DivideAndConquer;

public class PowXN {
/*
50. Pow(x, n) (Medium)
Binary Exponentiation (Iterative Fast Exponentiation)
TC: O(logN)
SC: O(1)
*/
    class Solution {
        public double myPow(double x, int n) {
            long N = n;

            //when n is -ve
            if(N < 0){
                x = 1/x;
                N = -N;
            }

            double result = 1.0;
            while(N > 0){
                if(N%2 == 1){
                    result *= x;
                }
                x *= x;
                N /= 2;
            }

            return result;
        }
    }
}

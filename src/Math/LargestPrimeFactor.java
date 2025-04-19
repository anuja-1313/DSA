package Math;

public class LargestPrimeFactor {

/*
Largest prime factor - Medium
TC: O(√n)
SC: O(1)
*/

    class Solution {
        static int largestPrimeFactor(int n) {
            // code here
            //since sieve gave a TLE lets try something else

            if(n<2){
                return n;
            }

            int largest = -1;

            //get all 2's out of the way
            while(n%2 == 0){
                n /= 2;
                largest = 2;
            }

            //move on to other primes if 2 is not the largest
            //handles numbers till √n
            for(int i=3; i*i<=n; i++){
                while(n%i == 0){
                    largest = i;
                    n = n / i;
                }
            }

            //when the number itself is the largest prime factor, ex = 97
            if(n>2){
                largest = n;
            }

            return largest;
        }

    }
}

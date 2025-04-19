package Math;
import java.util.*;

public class SumOfAllPrimesFrom1ToN {

//Sieve of Eratosthenes
//TC: O(N log log N)
//SC: O(N) , arrPrime array
    class Solution {
        public int prime_Sum(int n) {
            // code here
            boolean[] arrPrime = new boolean[n+1];
            Arrays.fill(arrPrime, true);
            arrPrime[0] = arrPrime[1] = false;

            for(int i=2; i*i<=n; i++){
                if(arrPrime[i]){
                    for(int j = i*i; j<=n; j = j + i){
                        arrPrime[j] = false;
                    }
                }
            }

            int sum = 0;
            for(int i=2; i<=n; i++){
                if(arrPrime[i]){
                    sum = sum + i;
                }
            }

            return sum;
        }
    }

/*
Sum of all prime numbers between 1 and n - Easy
TC: O(n√n)
SC: O(1)
*/

    /*
    class Solution {
        public int prime_Sum(int n) {
            // code here
            int sum = 0;
            for(int i=2; i<=n; i++){
                if(isPrime(i)){
                    sum = sum + i;
                }
            }
            return sum;
        }
        public boolean isPrime(int num){
            for(int i=2; i*i<=num; i++){
                if(num%i == 0){
                    return false;
                }
            }
            return true;
        }
    }
    */
}

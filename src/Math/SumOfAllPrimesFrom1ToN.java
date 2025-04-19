package Math;

public class SumOfAllPrimesFrom1ToN {
    /*
Sum of all prime numbers between 1 and n - Easy
TC: O(n√n)
SC: O(1)
*/
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
}

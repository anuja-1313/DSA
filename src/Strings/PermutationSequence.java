package Strings;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {

/*
60. Permutation Sequence (Hard)

every number has (n-1)! permutations with it as the front number
identify that number, remove it, move on to next number, remove it
continue till we are left with nothing, append every removal to string

Time Complexity : O(N²) , add elements to list O(N) + remove elements and shift for each element O(N²)
Space Complexity : 	O(N), list, string builder
*/
    class Solution {
        public String getPermutation(int n, int k) {
            //n=3, k=3
            List<Integer> number = new ArrayList<>();
            int factorial = 1;
            for(int i=1; i<=n; i++){
                number.add(i); // 1, 2, 3
                factorial *= i; //6
            }

            k--; //0 indexing , k = 2
            StringBuilder result = new StringBuilder();
            for(int i=n; i>0; i--){
                factorial = factorial / i; //get (n-1)! => (3-1)!
                int index = k / factorial; //get the index to first number of result string => 2/2! = 1
                result.append(number.get(index)); // 2
                number.remove(index);
                k = k % factorial; //subtracting all past permutations that we wont use
                //move to next block
            }

            return result.toString();
        }
    }
}

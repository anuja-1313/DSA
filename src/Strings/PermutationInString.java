package Strings;

public class PermutationInString {

/*
567. Permutation in String (Medium)
TC: O(N), N = s2.length
SC: O(1)
*/
    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            //sliding window + frequency map with array
            if(s1.length() > s2.length()){
                return false;
            }

            int[] count = new int[26];

            //First Window
            for(int i=0; i<s1.length(); i++){
                count[s1.charAt(i) - 'a']++; //adding character occurrences from s1
                count[s2.charAt(i) - 'a']--; //checking if first window of s2 itself has the permutation of s1
            }

            if(allZero(count))
            {
                return true;
            }

            //Sliding window
            for(int i=s1.length(); i<s2.length(); i++){
                count[s2.charAt(i) - 'a']--; //adding new character
                count[s2.charAt(i-s1.length()) - 'a']++; //releasing old character
                if(allZero(count)){
                    return true;
                }
            }

            return false;
        }
        boolean allZero(int[] count){
            //if all values are 0, we have encountered the permutation
            for(int value : count){
                if(value != 0){
                    return false;
                }
            }
            return true;
        }
    }
}

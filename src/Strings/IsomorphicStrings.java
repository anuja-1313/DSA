package Strings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    /*
205. Isomorphic Strings - Easy
 Time Complexity: O(N)
 Space Complexity: O(N)
*/
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            //map characters from one string to another
            if(s.length() != t.length()){
                return false;
            }

            Map<Character, Character> mapS = new HashMap<>(); //map of s string
            Map<Character, Character> mapT = new HashMap<>(); //map of t string

            for(int i=0; i<s.length(); i++){
                char chS = s.charAt(i);
                char chT = t.charAt(i);

                if(mapS.containsKey(chS)){
                    if(mapS.get(chS) != chT){
                        return false;
                    }
                }
                else {
                    mapS.put(chS, chT);
                }

                if(mapT.containsKey(chT)){
                    if(mapT.get(chT) != chS){
                        return false;
                    }
                }
                else {
                    mapT.put(chT, chS);
                }
            }

            return true;
        }
    }
}

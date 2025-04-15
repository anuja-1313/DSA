package HashMap;

import java.util.HashMap;

public class ValidAnagram {

    class Solution {
        public boolean isAnagram(String s, String t) {
            if(s.length() != t.length()){
                return false;
            }

            HashMap<Character, Integer> map = new HashMap<>();

            for(int i=0; i<s.length(); i++){
                char chS = s.charAt(i);
                char chT = t.charAt(i);

                map.put(chS, map.getOrDefault(chS, 0) + 1);
                map.put(chT, map.getOrDefault(chT, 0) - 1);
            }

            for(int countFreq : map.values()){
                if(countFreq != 0){
                    return false;
                }
            }

            return true;
        }
    }


/*
Can be done using Single HashMap
242. Valid Anagram - Easy
TC: O(N)
SC: O(N)
*/
/*
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            mapS.put(chS, mapS.getOrDefault(chS, 0)+1);
            mapT.put(chT, mapT.getOrDefault(chT, 0)+1);
        }

        return mapS.equals(mapT);
    }
}
*/
}


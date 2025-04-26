package Strings;

import java.util.*;

public class FindTheMostCommonResponse {
/*
Biweekly Contest 155
Find the Most Common Response (Medium)
TC: O(n*m), n = no.of response lists, m = average number of answers per list
SC: O(n*m), set and map
*/
    class Solution {
        public String findCommonResponse(List<List<String>> responses) {
            int n = responses.size();
            //track frequency
            //creating map outside so it doesn't reset
            HashMap<String, Integer> map = new HashMap<>();

            for(int i=0; i<n; i++){
                List<String> res = responses.get(i);
                //add all res values to set, used to keep track of all unique strings
                Set<String> set = new HashSet<>(res);
                for(String str : set){
                    map.put(str, map.getOrDefault(str ,0) + 1);
                }
            }

            int max = 0;
            String result = " ";
            for(Map.Entry<String, Integer> entry : map.entrySet()){
                String s = entry.getKey();
                int count = entry.getValue();
                //return highest frequency or smallest lexicographically
                if(count > max || (count == max && (s.compareTo(result) < 0))){
                    result = s;
                    max = count;
                }
            }

            return result;
        }
    }
}

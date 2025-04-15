package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayDuplicates {
    /*
Array Duplicates
TC: O(N)
SC: O(N), Map to store N entries
*/
    class Solution {
        public List<Integer> findDuplicates(int[] arr) {
            // code here
            Map<Integer,Integer> map = new HashMap<>();
            List<Integer> result = new ArrayList<>();

            for(int i=0; i<arr.length; i++){
                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            }

            for(Map.Entry<Integer,Integer> set : map.entrySet()){
                if(set.getValue() > 1){
                    result.add(set.getKey());
                }
            }

            return result;
        }
    }
}

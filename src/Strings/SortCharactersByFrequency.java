package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {

    /*
451. Sort Characters By Frequency - Medium
TC: O(NlogN), insertion in priority queue
SC: O(N) - hashmap, queue, stringbuilder
*/
    class Solution {
        public String frequencySort(String s) {
            HashMap<Character,Integer> map = new HashMap<>();

            //building frequenct map - O(N)
            for(int i = 0; i<s.length(); i++){
                char ch = s.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0)+1);
            }

            //max heap to store as per character frequency
            //O(NlogN)
            PriorityQueue<Map.Entry<Character, Integer>> queue = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

            queue.addAll(map.entrySet());

            StringBuilder str = new StringBuilder();
            //O(N) - building result string
            while(!queue.isEmpty()){
                Map.Entry<Character, Integer> entry = queue.poll();
                char ch = entry.getKey();
                int freq = entry.getValue();
                str.append(String.valueOf(ch).repeat(freq)); // repeat the character and append to str
            }

            return str.toString();

        }
    }
}

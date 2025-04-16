package Sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SortingElementsOfAnArrayByFrequency {

/*
Sorting Elements of an Array by Frequency (GFG)- Medium
Time Complexity: O(N log N)
Space Complexity: O(N)
*/

    public class Main {
        public static void main(String[] args) {
            //isnt this Hashmap + Max Priority Queue?

            Scanner sc = new Scanner(System.in);
            int in = sc.nextInt();

            for(int i=0; i<in; i++){
                int n = sc.nextInt();

                int[] arr = new int[n];

                for(int j=0; j<n; j++){
                    arr[j] = sc.nextInt();
                }

                frequency(arr, n);
                System.out.println();
            }

        }

        public static void frequency(int[] arr, int n){
            HashMap<Integer, Integer> map = new HashMap<>();

            for(int i=0; i<n; i++){
                map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            }

            PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((a, b) -> {
                if(b.getValue().equals(a.getValue())){
                    return a.getKey() - b.getKey(); //if same frequency return smaller element first
                }
                else{
                    return b.getValue() - a.getValue(); //return higher frequency
                }
            });

            queue.addAll(map.entrySet());


            while(!queue.isEmpty()){
                Map.Entry<Integer, Integer> value = queue.poll();
                int key = value.getKey();
                int freq = value. getValue();

                //print sorted array with space in between
                for(int i=0; i<freq; i++){
                    System.out.print(key + " ");
                }
            }

        }
    }
}

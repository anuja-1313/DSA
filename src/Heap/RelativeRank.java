package Heap;

import java.util.PriorityQueue;

public class RelativeRank {

    /*
506. Relative Ranks
TC : O(NlogN) add and poll (logN) of N elements
SC : O(N) , string array and heap space
*/

    class Solution {
        public String[] findRelativeRanks(int[] score) {
            int n = score.length;
            String[] result = new String[n];

            //Max heap to store numbers in descending order
            //((a,b) -> b[0] - a[0]) - lambda expression for primitive int array, custom comparator for max heap
            //b[0] - a[0] = 100 - 90 = 10 > 0
            //(a, b) - score, index
            //compare b[0] to a[0] so larger values come first
            PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);

            //adding elements to heap with index
            //2 element array score, index
            for(int i=0; i<n; i++){
                maxHeap.add(new int[] {score[i], i});
            }

            //Assigning Ranks
            int rank = 1;
            while(!maxHeap.isEmpty()){
                int[] current = maxHeap.poll();
                int index = current[1];

                if(rank == 1){
                    result[index] = "Gold Medal";
                }
                else if(rank == 2){
                    result[index] = "Silver Medal";
                }
                else if(rank == 3){
                    result[index] = "Bronze Medal";
                }
                else{
                    result[index] = String.valueOf(rank);
                }

                rank++;
            }

            return result;
        }
    }
}


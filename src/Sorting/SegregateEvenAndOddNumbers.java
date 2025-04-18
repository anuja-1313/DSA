package Sorting;
import java.util.*;

public class SegregateEvenAndOddNumbers {

    /*
Segregate Even and Odd numbers GFG - Basic
TC: O(n log n), sort function
SC: O(1)
*/
    class Solution {
        void segregateEvenOdd(int arr[]) {
            // code here
            int n = arr.length;
            int evenIndex = 0; //count number of even elements passed

            for(int i=0; i<n; i++){
                if(arr[i] % 2 == 0){
                    swap(arr, i, evenIndex); //swap even elements to left
                    evenIndex++;
                }
            }


            Arrays.sort(arr, 0, evenIndex);
            Arrays.sort(arr, evenIndex, n); //last index is not included in sort function
        }

        public void swap(int[] arr, int a, int b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

    }
}

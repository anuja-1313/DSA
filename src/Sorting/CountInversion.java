package Sorting;

public class CountInversion {

    /*
Count Inversions GFG - Medium
TC: O(N logN) , modifies merge sort
SC: O(N) , temp array for merge
*/

    class Solution {

        static int inversionCount(int arr[]) {

            //Merge Sort
            //count everytime p2 < p1

            int n = arr.length;

            return mergeSort(arr, 0, n-1);

        }

        static int mergeSort(int[] arr, int start, int end){
            if(start >= end){
                return 0;
            }

            int mid = start + (end-start)/2;

            //count in left half
            int leftCount = mergeSort(arr, start, mid);
            //count in right half
            int rightCount = mergeSort(arr, mid+1, end);

            //merge the two halves and count inversions during merge
            int mergeCount = merge(arr, start, mid, end);

            return leftCount + rightCount + mergeCount; //total inversions
        }

        static int merge(int[] arr, int start, int mid, int end){
            int[] temp = new int[end-start+1];
            int p1 = start;
            int p2 = mid+1;
            int p3 = 0;
            int count = 0;

            while(p1<=mid && p2<=end){
                if(arr[p1] <= arr[p2]){
                    temp[p3] = arr[p1];
                    p3++; p1++;
                }
                else{
                    count += (mid-p1+1);
                    temp[p3] = arr[p2];
                    p3++; p2++;
                }
            }

            while(p1<=mid){
                temp[p3] = arr[p1];
                p3++; p1++;
            }

            while(p2<=end){
                temp[p3] = arr[p2];
                p3++; p2++;
            }

            //copy new array to og
            System.arraycopy(temp, 0, arr, start, temp.length);

            return count;

        }
    }
}

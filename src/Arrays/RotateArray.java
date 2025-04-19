package Arrays;

public class RotateArray {

//Rotate Array -  GFG (Medium)
//TC: O(n) , O(d + (n - d) + n) = O(n)
//SC: O(1)

    class Solution {
        static void rotateArr(int arr[], int d) {

            int n = arr.length;
            d = d % n; //for d > n

            //reverse first d elements
            reverse(arr, 0, d-1);
            //reverse n-d elements
            reverse(arr, d, n-1);
            //reverse whole array
            reverse(arr, 0, n-1);
        }

        static void reverse(int[] arr, int start, int end){
            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }
}

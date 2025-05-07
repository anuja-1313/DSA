package Recursion;

public class PrintNumbersNto1 {
    /*
    Print N to 1 without loop (Easy)
    TC: O(N)
    SC: O(N)
    */
    class Solution {

        void printNos(int N) {
            // code here
            if(N == 0){
                return;
            }

            System.out.print(N + " ");
            printNos(N-1);
        }
    }
}

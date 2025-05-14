package Arrays;

public class PartitionArrayThreePartsEqualsum {
    //Time Complexity: O(N)
//Space Complexity: O(1)
//1013. Partition Array Into Three Parts With Equal Sum (Easy)
    class Solution {
        public boolean canThreePartsEqualSum(int[] arr) {
            int n = arr.length;
            int sum = 0;
            int partSum = 0;
            int count = 0;
            for(int i=0; i<n; i++)
            {
                sum += arr[i];
            }
            if(sum % 3 == 0){
                int s = sum / 3;
                for(int i=0; i<n; i++){
                    partSum += arr[i];
                    if(partSum == s){
                        count++;
                        partSum = 0;
                    }

                }
            }
            if(count >= 3){
                return true;
            }

            return false;
        }
    }
}

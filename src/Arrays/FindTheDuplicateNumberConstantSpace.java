package Arrays;

public class FindTheDuplicateNumberConstantSpace {
    /*
287. Find the Duplicate Number - Medium
TC: O(N)
SC: O(1)
*/
    class Solution {
        public int findDuplicate(int[] nums) {
            //Floyd Tortoise and Hare(Cycle Detection)
            //slow and fast pointer
            //visualise array as a linked list
            int slow = nums[0];
            int fast = nums[0]; //starting both pointers at start

            //step 1: check if cycle exists
            do{
                slow = nums[slow]; //move one step
                fast = nums[nums[fast]]; //move two step
            }while(slow != fast);

            //detect cycle start point - which is the duplicate number
            //reset slow to 0 index
            slow = nums[0];
            while(slow != fast){
                //move both pointers one step at a time
                slow = nums[slow];
                fast = nums[fast];
            }

            return slow;
        }
    }
}

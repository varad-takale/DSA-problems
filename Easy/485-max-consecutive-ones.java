// 485. Max Consecutive Ones (Easy)
// https://leetcode.com/problems/max-consecutive-ones/
// Runtime: 2 ms  Memory: 52.8 MB
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0,
            max = 0;

            for (int i = 0;i<nums.length;i++){
                if(nums[i] == 1){
                    count ++;
                }
                else{
                    max = Math.max(max , count);
                    count = 0;
                }
            }
            return Math.max(max , count);
    }
}

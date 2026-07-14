// 1. Two Sum (Easy)
// https://leetcode.com/problems/two-sum/
// Runtime: 49 ms  Memory: 46.8 MB
class Solution {
    public int[] twoSum(int[] nums, int target) {
          int[]ans=new int[2];
       for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                ans[0]=i;
                ans[1]=j;
            }
        }
       } 
       return ans;
    }
}

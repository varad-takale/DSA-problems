// 217. Contains Duplicate (Easy)
// https://leetcode.com/problems/contains-duplicate/
// Runtime: 25 ms  Memory: 81.7 MB
class Solution {
    public boolean containsDuplicate(int[] nums) {
          Arrays.sort(nums);
       /* Set<Integer>set = new HashSet<>();
        for (int num:nums){
            if(set.contains(nums)){
                return true;
            }
        }
        return false;*/

        
        for(int i = 0; i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }return false;

        
    }
}





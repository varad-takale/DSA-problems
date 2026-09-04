// 1. Two Sum (Easy)
// https://leetcode.com/problems/two-sum/
// Runtime: 2 ms  Memory: 46.9 MB
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer , Integer>map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int lookupnumber = target - nums[i];

            if(map.containsKey(lookupnumber)){
                return new int []{
                    i,
                    map.get(lookupnumber)
                    
                    
                };
                
            }
             map.put(nums[i],i);
           
        }
        return new int[]{-1-1};
        
    }
}


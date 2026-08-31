// 136. Single Number (Easy)
// https://leetcode.com/problems/single-number/
// Runtime: 1 ms  Memory: 46.7 MB
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
    for(int num:nums){
            res = res ^ num;
        }
        return res;
        
    }
}

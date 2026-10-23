// 169. Majority Element (Easy)
// https://leetcode.com/problems/majority-element/
// Runtime: 7 ms  Memory: 63.1 MB
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
           
        Arrays.sort(nums);
        return nums[n/2];

        }
    }


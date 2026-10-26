// 628. Maximum Product of Three Numbers (Easy)
// https://leetcode.com/problems/maximum-product-of-three-numbers/
// Runtime: 15 ms  Memory: 47.4 MB
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        return Math.max(nums[n-1]*nums[n-2]*nums[n-3],
                        nums[0]*nums[1]*nums[n-1]);
    }
}

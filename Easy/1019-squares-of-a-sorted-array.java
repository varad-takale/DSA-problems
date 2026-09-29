// 1019. Squares of a Sorted Array (Easy)
// https://leetcode.com/problems/squares-of-a-sorted-array/
// Runtime: 1 ms  Memory: 47.1 MB
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int l = 0,
                r = nums.length - 1;
        int res[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int val;

            if (Math.abs(nums[l]) > Math.abs(nums[r])) {
                val = nums[l];
                l++;
            } else {
                val = nums[r];
                r--;
            }
            res[i] = val * val;
        }
        return res;
    }
}

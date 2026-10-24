// 35. Search Insert Position (Easy)
// https://leetcode.com/problems/search-insert-position/
// Runtime: 0 ms  Memory: 44.5 MB
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {

            if (nums[i] >= target) {
                return i;
            }
        }

        return n;
    }
}

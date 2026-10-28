// 748. Largest Number At Least Twice of Others (Easy)
// https://leetcode.com/problems/largest-number-at-least-twice-of-others/
// Runtime: 0 ms  Memory: 42.9 MB
class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int max = -1;
        int secondmax = -1;
        int index = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                secondmax = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > secondmax) {
                secondmax = nums[i];
            }
        }

        if (max >= 2 * secondmax) {
            return index;
        }

        return -1;

    }
}

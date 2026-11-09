// 1018. Largest Perimeter Triangle (Easy)
// https://leetcode.com/problems/largest-perimeter-triangle/
// Runtime: 11 ms  Memory: 47.2 MB
class Solution {
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = n - 1; i >= 2; i--) {
            if (nums[i - 2] + nums[i - 1] > nums[i]) {
                return nums[i - 2] + nums[i - 1] + nums[i];
            }
        }

        return 0;
    }
}

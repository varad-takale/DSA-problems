// 724. Find Pivot Index (Easy)
// https://leetcode.com/problems/find-pivot-index/
// Runtime: 2 ms  Memory: 46.2 MB
class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalsum += nums[i];
        }

        int leftsum = 0;

        for (int i = 0; i < nums.length; i++) {
            int rightsum = totalsum - leftsum - nums[i];

            if (rightsum == leftsum) {
                return i;
            }

            leftsum += nums[i];

        }

        return -1;
    }
}

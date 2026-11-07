// 2350. Find Closest Number to Zero (Easy)
// https://leetcode.com/problems/find-closest-number-to-zero/
// Runtime: 3 ms  Memory: 45.9 MB
class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = nums[0];

        for (int num : nums) {
            if (Math.abs(num) < Math.abs(closest)) {
                closest = num;
            }

            else if (Math.abs(num) == Math.abs(closest) && num > closest) {
                closest = num;
            }
        }

        return closest;
    }
}

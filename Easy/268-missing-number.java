// 268. Missing Number (Easy)
// https://leetcode.com/problems/missing-number/
// Runtime: 8 ms  Memory: 47.8 MB
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        int sum = n * (n + 1) / 2;

        for (int i = 0; i < nums.length; i++) {
            sum = sum - nums[i];
        }

        return sum;
    }

}

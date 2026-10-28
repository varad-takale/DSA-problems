// 1848. Sum of Unique Elements (Easy)
// https://leetcode.com/problems/sum-of-unique-elements/
// Runtime: 1 ms  Memory: 42.3 MB
class Solution {
    public int sumOfUnique(int[] nums) {
        int n = nums.length;

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                sum = sum + nums[i];
            }

        }

        return sum;
    }
}

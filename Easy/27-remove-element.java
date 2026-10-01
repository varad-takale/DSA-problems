// 27. Remove Element (Easy)
// https://leetcode.com/problems/remove-element/
// Runtime: 0 ms  Memory: 43.3 MB
class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}

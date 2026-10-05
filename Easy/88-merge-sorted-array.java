// 88. Merge Sorted Array (Easy)
// https://leetcode.com/problems/merge-sorted-array/
// Runtime: 4 ms  Memory: 44 MB
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}

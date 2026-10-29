// 448. Find All Numbers Disappeared in an Array (Easy)
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Runtime: 3 ms  Memory: 66.3 MB
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        boolean present[] = new boolean[n + 1];
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            present[num] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                result.add(i);
            }
        }

        return result;
    }
}

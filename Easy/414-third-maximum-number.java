// 414. Third Maximum Number (Easy)
// https://leetcode.com/problems/third-maximum-number/
// Runtime: 7 ms  Memory: 44.9 MB
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        int i = 0,
                j = nums.length - 1;

        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        int elecount = 1;
        for (int k = 1; k < nums.length; k++) {
            if (nums[k] != nums[k - 1]) {
                elecount++;

            }
            if (elecount == 3) {
                return nums[k];
            }
        }

        return nums[0];

    }
}

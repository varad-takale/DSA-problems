// 941. Sort Array By Parity (Easy)
// https://leetcode.com/problems/sort-array-by-parity/
// Runtime: 1 ms  Memory: 46.7 MB
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            int mod1 = nums[i] % 2;
            int mod2 = nums[j] % 2;

            if (mod1 == 1 && mod2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            if (mod1 == 0) {
                i++;
            }

            if (mod2 == 1) {
                j--;
            }
        }
        return nums;
    }
}

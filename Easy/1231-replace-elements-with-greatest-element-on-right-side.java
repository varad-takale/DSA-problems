// 1231. Replace Elements with Greatest Element on Right Side (Easy)
// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
// Runtime: 3 ms  Memory: 49.3 MB
class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }
        return arr;
    }
}

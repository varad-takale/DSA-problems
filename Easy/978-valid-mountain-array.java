// 978. Valid Mountain Array (Easy)
// https://leetcode.com/problems/valid-mountain-array/
// Runtime: 2 ms  Memory: 47.4 MB
class Solution {
    public boolean validMountainArray(int[] arr) {
        int i = 0,
                n = arr.length;

        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        if (i == 0 || i == n - 1) {
            return false;
        }
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }
        return i == n - 1;
    }
}

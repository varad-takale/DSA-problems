// 1510. Find Lucky Integer in an Array (Easy)
// https://leetcode.com/problems/find-lucky-integer-in-an-array/
// Runtime: 11 ms  Memory: 44.4 MB
class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;

        int lucky = -1;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == arr[i]) {
                lucky = Math.max(lucky, arr[i]);
            }
        }

        return lucky;

    }
}

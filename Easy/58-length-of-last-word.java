// 58. Length of Last Word (Easy)
// https://leetcode.com/problems/length-of-last-word/
// Runtime: 0 ms  Memory: 41.4 MB
class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (count > 0) {
                    break;
                }
            }

            else {
                count++;
            }
        }

        return count;
    }
}

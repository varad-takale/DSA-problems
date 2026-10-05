// 1468. Check If N and Its Double Exist (Easy)
// https://leetcode.com/problems/check-if-n-and-its-double-exist/
// Runtime: 2 ms  Memory: 44.6 MB
class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer>set = new HashSet<>();
        for(int num : arr) {
            if(set.contains(2 * num) || (set.contains(num / 2) && (num % 2 == 0))){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}

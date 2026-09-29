// 1019. Squares of a Sorted Array (Easy)
// https://leetcode.com/problems/squares-of-a-sorted-array/
// Runtime: 10 ms  Memory: 48.8 MB
class Solution {
    public int[] sortedSquares(int[] nums) {
        int N = nums.length;
        int result[] = new int[N];

        for(int i = 0; i<N; i++){
            result[i] = nums[i]*nums[i];
            
        }
        Arrays.sort(result);
    return result;
    }

   
}

// 189. Rotate Array (Medium)
// https://leetcode.com/problems/rotate-array/
// Runtime: 8 ms  Memory: 267.8 MB
class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k =  k % n;
        int count = 0;


        for(int i=0;count<n;i++){
            int idx = i;
            int curr = nums[idx];
 

    do{
        int next = (idx + k) % n;
       int temp = nums[next];
       nums[next] = curr;
       curr = temp;
        idx = next;
        count = count + 1;


    }while(idx != i);
        
    }
}
}

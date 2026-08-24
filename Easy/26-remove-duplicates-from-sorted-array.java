// 26. Remove Duplicates from Sorted Array (Easy)
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Runtime: 1 ms  Memory: 46.4 MB
class Solution {
    public int removeDuplicates(int[] nums) {

        int k = 1;
        for(int j=1; j<nums.length; j++){
            if(nums[j] != nums[j-1]){
                nums[k]=nums[j];
                k = k+1;
            }

           
        }
         return k;
        

        }
        
    }


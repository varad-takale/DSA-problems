// 1421. Find Numbers with Even Number of Digits (Easy)
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// Runtime: 1 ms  Memory: 44.7 MB
class Solution {
    public boolean numbersHasEvenDigits(int num ){
        int digitcount = 0;
        while( num != 0){
            num = num/10;
            digitcount ++;
        }
        return digitcount % 2 == 0;
    }
    public int findNumbers(int[] nums) {
        int evencount = 0;
        for(int i = 0;i<nums.length;i++){
              if(numbersHasEvenDigits(nums[i])){
                evencount ++;
              }
        }
        return evencount;
    }
}

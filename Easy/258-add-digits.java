// 258. Add Digits (Easy)
// https://leetcode.com/problems/add-digits/
// Runtime: 1 ms  Memory: 42.4 MB
class Solution {
    public int addDigits(int number) {
        while(number >= 10){
            int sum = 0;
               
               while(number > 0){
                 sum = sum + number % 10;
                 number = number/10;

               }
               number = sum;
        }
        return number;
    }
}

// 9. Palindrome Number (Easy)
// https://leetcode.com/problems/palindrome-number/
// Runtime: 5 ms  Memory: 45.7 MB
class Solution {
    public boolean isPalindrome(int x) {

        if (x<0){
            return false;
        }

        int original = x;
        int reverse =0;

        while(x>0){
          int number = x % 10;
          reverse = reverse*10 + number;
          x=x/10;
        }
        return original==reverse;
    }
}

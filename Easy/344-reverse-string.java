// 344. Reverse String (Easy)
// https://leetcode.com/problems/reverse-string/
// Runtime: 0 ms  Memory: 48 MB
class Solution {
    public void reverseString(char[] s) {

        int i = 0;
        int j = s.length-1;

        while( i < j){

            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--; 
        }
        
    }
}

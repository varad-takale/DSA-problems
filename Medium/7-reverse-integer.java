// 7. Reverse Integer (Medium)
// https://leetcode.com/problems/reverse-integer/
// Runtime: 1 ms  Memory: 42.3 MB
class Solution {
    public int reverse(int x) {
//         int num=0;
//         int num2=x;
//         if(num2<0){
//             num2*=-1;
//         }
        
//         while(num2>0){
//             int ld=num2%10;
//               if (num > Integer.MAX_VALUE / 10 || 
//                (num == Integer.MAX_VALUE / 10 && ld > 7)) {
//                 return 0;
//             }

//             // Check for underflow
//             if (num < Integer.MIN_VALUE / 10 || 
//                (num == Integer.MIN_VALUE / 10 && ld < -8)) {
//                 return 0;
//             }
//             num=num*10+ld;

//             num2=num2/10;
//         }
//         if(x<0){
//             return -num;
//         }
//         return num;
     int rev = 0;

     while(x != 0){
        int digit = x % 10;

        if(rev > Integer.MAX_VALUE / 10){
            return 0;
        }

        if(rev == Integer.MAX_VALUE / 10 && digit > 7){
            return 0;
        }

        if(rev < Integer.MIN_VALUE / 10){
            return 0;
        }

         if(rev == Integer.MIN_VALUE / 10 && digit < -8){
            return 0;
        }

        rev = rev * 10 + digit;
        x = x/10;
         
     }
     return rev;
    }
    
     
}


// 387. First Unique Character in a String (Easy)
// https://leetcode.com/problems/first-unique-character-in-a-string/
// Runtime: 29 ms  Memory: 46.9 MB
class Solution {
    public int firstUniqChar(String s) {
        
        Map<Character,Integer>map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);

        }

        for(int i =0;i<s.length();i =i+1){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}

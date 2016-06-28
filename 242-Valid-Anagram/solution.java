public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        int[] alphabet= new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a'] += 1;
            alphabet[t.charAt(i) - 'a'] -= 1;
        }
        for (int n = 0; n < 26; n++) {
            if (alphabet[n] != 0) {
                return false;
            }
        }
        return true;
        
    }
}
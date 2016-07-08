public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        if (s.length() == 0) return true;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.indexOf(s.charAt(i), i + 1) != t.indexOf(t.charAt(i), i + 1)) {
                return false;
            }
        }
        return true;
    }
}
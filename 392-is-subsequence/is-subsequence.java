class Solution {
    public boolean isSubsequence(String s, String t) {
        int prev = 0;
        int found = 0;
        for(int i = 0; i < s.length(); i++) {
            for(int j = prev; j < t.length(); j++) {
                if(s.charAt(i) == t.charAt(j)) {
                    ++found;
                    prev = j + 1;
                    break;
                }
            }
        }
        return found == s.length();
    }
}
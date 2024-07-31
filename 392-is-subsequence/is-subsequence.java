class Solution {
    public boolean isSubsequence(String s, String t) {
        // O(N), O(1)
        int sIdx = 0;
        int tIdx = 0;

        while(sIdx < s.length() && tIdx < t.length()) {
            if(s.charAt(sIdx) == t.charAt(tIdx)) {
                ++sIdx;
            }
            ++tIdx;
        }
        return sIdx == s.length();

        // O(N^2), O(1)
        // int prev = 0;
        // int found = 0;
        // for(int i = 0; i < s.length(); i++) {
        //     for(int j = prev; j < t.length(); j++) {
        //         if(s.charAt(i) == t.charAt(j)) {
        //             ++found;
        //             prev = j + 1;
        //             break;
        //         }
        //     }
        // }
        // return found == s.length();
    }
}
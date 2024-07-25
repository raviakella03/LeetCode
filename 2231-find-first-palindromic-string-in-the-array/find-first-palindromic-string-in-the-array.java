class Solution {
    public String firstPalindrome(String[] words) {
        int ipLen = words.length;
        for(int i = 0; i < ipLen; i++) {
            if(isPalindrome(words[i])) {
                return words[i];
            }
        }
        return "";
    }

    private boolean isPalindrome(String word) {
        int wordLen = word.length();
        if(wordLen == 1) {
            return true;
        } else {
            int left = 0;
            int right = wordLen - 1;
            while(left < right) {
                if(word.charAt(left) != word.charAt(right)) {
                    return false;
                } else {
                    ++left;
                    --right;
                }
            }
        }
        return true;
    }
}
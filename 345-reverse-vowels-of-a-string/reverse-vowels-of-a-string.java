class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            char ch = sb.charAt(left);
            boolean isLeftVowel = ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                               || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
            ch = sb.charAt(right);
            boolean isRightVowel = ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
            if(isLeftVowel && isRightVowel) {
                //interchange
                ch = sb.charAt(left);
                sb.setCharAt(left++, sb.charAt(right));
                sb.setCharAt(right--, ch);
            } else if(isLeftVowel) {
                --right;
            } else {
                ++left;
            }
        }
        return sb.toString();
    }
}
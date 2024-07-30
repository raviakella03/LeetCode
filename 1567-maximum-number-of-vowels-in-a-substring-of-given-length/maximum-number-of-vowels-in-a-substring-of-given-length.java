class Solution {
    public int maxVowels(String s, int k) {
        int ipLen = s.length();
        char ch;
        //ch = 'a' || ch = 'e' || ch = 'i' || ch = 'o' || ch = 'u'
        int max = 0;
        for(int i = 0; i < k; i++) {
            ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++max;
            }
        }

        int curr = max;
        int discard = 0;

        for(int i = k; i < ipLen; i++) {
            ch = s.charAt(discard);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                --curr;
            }

            ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++curr;
            }

            max = Math.max(max, curr);
            ++discard;
        }
        return max;

    }
}
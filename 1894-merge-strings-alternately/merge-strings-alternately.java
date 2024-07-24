class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int length1 = word1.length();
        int length2 = word2.length();
        int resultLen = length1 + length2;
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < length1 && j < length2) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            ++i;
            ++j;
        }


        while(i < length1) {
            sb.append(word1.charAt(i));
            ++i;
        }

        while(j < length2) {
            sb.append(word2.charAt(j));
            ++j;
        }

        return sb.toString();
    }
}
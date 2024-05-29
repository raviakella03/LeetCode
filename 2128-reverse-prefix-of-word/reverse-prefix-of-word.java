class Solution {
    public String reversePrefix(String word, char ch) {
        int strLen = word.length();
		char[] result = word.toCharArray();
		int indexOfCh = -1;
		int left = 0;
		for(int i = 0; i < strLen; i++) {
			if(word.charAt(i) == ch) {
				indexOfCh = i;
				break;
			}
		}

		while(left < indexOfCh) {
			char temp = result[left];
			result[left] = result[indexOfCh];
			result[indexOfCh] = temp;
			++left;
			--indexOfCh;
		}
		return String.valueOf(result);
    }
}
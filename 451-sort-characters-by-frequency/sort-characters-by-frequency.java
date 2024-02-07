class Solution {
    // T.C. - O(N)
    // S.C. - O(N)
    public String frequencySort(String s) {

        // O(123) --> O(1)
        int[] freqArr = new int[123];
        char[] charArr = s.toCharArray();
        int ipLen = charArr.length;
        int maxFreq = Integer.MIN_VALUE;
        // O(52 * freq of each element) --> O(string length) --> O(N)
        Map<Integer, List<Character>> freqMap = new HashMap<>();
        // O(string length)
        for (int i = 0; i < ipLen; i++) {
            int idx = charArr[i];
            freqArr[idx] += 1;
            maxFreq = Math.max(maxFreq, freqArr[idx]);
        }

        for (int i = 48; i <= 122; i++) {
            if ((i >= 48 && i <= 57) || (i >= 65 && i <= 90) || (i >= 97 && i <= 122)) {
                List<Character> charList = freqMap.getOrDefault(freqArr[i], new ArrayList<Character>());
                charList.add(((char) i));
                freqMap.put(freqArr[i], charList);
            }
        }

        // StringBuilder sb = new StringBuilder();

        // for (int i = maxFreq; i >= 1; i--) {
        // List<Character> freqChar = freqMap.getOrDefault(i, new
        // ArrayList<Character>());
        // for (Character charac : freqChar) {
        // for (int j = i; j >= 1; j--) {
        // sb.append(charac);
        // }
        // }
        // }
        // return sb.toString();
        for (int i = 0; i < ipLen; i++) {
            for (int j = maxFreq; j >= 1; j--) {
                List<Character> freqChar = freqMap.getOrDefault(j, new ArrayList<Character>());
                for (Character charac : freqChar) {
                    for (int k = j; k >= 1; k--) {
                        charArr[i++] = charac;
                    }
                }
            }
        }
        return new String(charArr);

        /*
         * char[] str = s.toCharArray();
         * int[] freq = new int[128];
         * // for(char ch:s) freq[ch]++;
         * for (int i = 0; i < str.length; i++) {
         * freq[str[i]]++;
         * }
         * 
         * for (int i = 0; i < str.length;) {
         * char cmax = ',';
         * for (int j = 0; j < 128; j++) {
         * if (freq[j] > freq[cmax]) {
         * cmax = (char) j;
         * }
         * }
         * while (freq[cmax] != 0) {
         * str[i++] = cmax;
         * freq[cmax]--;
         * }
         * }
         * return new String(str);
         */

        /*
         * // Declare map for storing the frequency of each char in string
         * Map<Character, Integer> charFreq = new HashMap<>();
         * for (char c : s.toCharArray()) {
         * charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
         * }
         * 
         * // Declare a max heap for sorting the map values based on frequency
         * PriorityQueue<Map.Entry<Character, Integer>> maxHeap =
         * new PriorityQueue<>((a, b) -> Integer.compare(b.getValue(), a.getValue()));
         * maxHeap.addAll(charFreq.entrySet());
         * 
         * // Start storing the chars in ans frequency-wise
         * StringBuilder result = new StringBuilder();
         * while (!maxHeap.isEmpty()) {
         * Map.Entry<Character, Integer> entry = maxHeap.poll();
         * char ch = entry.getKey();
         * int freq = entry.getValue();
         * 
         * // Append the current char (freq) times
         * for (int i = 0; i < freq; i++) {
         * result.append(ch);
         * }
         * }
         * 
         * return result.toString();
         */
    }
}
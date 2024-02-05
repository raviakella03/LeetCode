class Solution {
    public int minimumTimeToInitialState(String word, int k) {
        Integer revertTime = 1;
        Integer wordLength = word.length();
        if(wordLength == k) {
            return 1;
        }
        while(true) {
            Integer from = revertTime * k;
            if (from < wordLength) {
                String remainingWord = word.substring(from);
                Integer remainingWordLength = remainingWord.length();

                if(word.startsWith(remainingWord)) {
                    break;
                }

                if(remainingWordLength < k) {
                    ++revertTime;
                    break;
                }

                ++revertTime;
            } else {
                break;
            }
        }
        return revertTime;
    }
}
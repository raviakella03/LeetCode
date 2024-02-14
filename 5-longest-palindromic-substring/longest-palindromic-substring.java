class Solution {
    public String longestPalindrome(String s) {
        String evenLengthLongestPalindrome = findMaxEvenLengthPalindrome(s);
        String oddLengthLongestPalindrome = findMaxOddLengthPalindrome(s);
        if (oddLengthLongestPalindrome.length() > evenLengthLongestPalindrome.length()) {
            return oddLengthLongestPalindrome;
        } else {
            return evenLengthLongestPalindrome;
        }
    }

    private String findMaxOddLengthPalindrome(String s) {
        int inputStringLength = s.length();
        int maxOddLengthOfPalindromicSubString = 0;
        int maxOddLengthStartIndex = 0;
        int maxOddLengthEndIndex = 0;
        for (int centreIndex = 0; centreIndex < inputStringLength; centreIndex++) {
            // int leftPointer = centreIndex - 1;
            // int rightPointer = centreIndex + 1;
            int leftPointer = centreIndex;
            int rightPointer = centreIndex;
            while (leftPointer >= 0 && rightPointer < inputStringLength) {
                if (s.charAt(leftPointer) == s.charAt(rightPointer)) {
                    if (maxOddLengthOfPalindromicSubString < rightPointer - leftPointer + 1) {
                        maxOddLengthOfPalindromicSubString = rightPointer - leftPointer + 1;
                        maxOddLengthStartIndex = leftPointer;
                        maxOddLengthEndIndex = rightPointer;
                    }
                    --leftPointer;
                    ++rightPointer;
                } else {
                    break;
                }
            }
        }
        return maxOddLengthOfPalindromicSubString == 0 ? String.valueOf(s.charAt(0))
                : s.substring(maxOddLengthStartIndex, maxOddLengthEndIndex + 1);
    }

    private String findMaxEvenLengthPalindrome(String s) {
        int inputStringLength = s.length();
        int maxEvenLengthOfPalindromicSubString = 0;
        int maxEvenLengthStartIndex = 0;
        int maxEvenLengthEndIndex = 0;
        for (int leftCentre = 0, rightCentre = 1; rightCentre < inputStringLength; leftCentre++, rightCentre++) {
            if (s.charAt(leftCentre) == s.charAt(rightCentre)) {
                int leftPointer = leftCentre;
                int rightPointer = rightCentre;
                while (leftPointer >= 0 && rightPointer < inputStringLength) {
                    if (s.charAt(leftPointer) == s.charAt(rightPointer)) {
                        if (maxEvenLengthOfPalindromicSubString < rightPointer - leftPointer + 1) {
                            maxEvenLengthOfPalindromicSubString = rightPointer - leftPointer + 1;
                            maxEvenLengthStartIndex = leftPointer;
                            maxEvenLengthEndIndex = rightPointer;
                        }
                        --leftPointer;
                        ++rightPointer;
                    } else {
                        break;
                    }
                }
            }
        }
        return maxEvenLengthOfPalindromicSubString == 0 ? String.valueOf(s.charAt(0))
                : s.substring(maxEvenLengthStartIndex, maxEvenLengthEndIndex + 1);
    }
}
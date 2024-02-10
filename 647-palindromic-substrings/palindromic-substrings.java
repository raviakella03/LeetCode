class Solution {
    public int countSubstrings(String s) {
        int strLen = s.length();
        return findOddLengthPalindromes(s) + findEvenLengthPalindromes(s);
    }

    private int findOddLengthPalindromes(String s) {
        int inputStringLength = s.length();
        int oddLengthPalindromesCount = 0;
        int maxOddLengthStartIndex = 0;
        int maxOddLengthEndIndex = 0;
        for (int centreIndex = 0; centreIndex < inputStringLength; centreIndex++) {
            int leftPointer = centreIndex;
            int rightPointer = centreIndex;
            while (leftPointer >= 0 && rightPointer < inputStringLength) {
                if (s.charAt(leftPointer) == s.charAt(rightPointer)) {
                    ++oddLengthPalindromesCount;
                    --leftPointer;
                    ++rightPointer;
                } else {
                    break;
                }
            }
        }
        return oddLengthPalindromesCount;
    }

    private int findEvenLengthPalindromes(String s) {
        int inputStringLength = s.length();
        int evenLengthPalindromesCount = 0;
        int maxEvenLengthStartIndex = 0;
        int maxEvenLengthEndIndex = 0;
        for (int leftCentre = 0, rightCentre = 1; rightCentre < inputStringLength; leftCentre++, rightCentre++) {
            if (s.charAt(leftCentre) == s.charAt(rightCentre)) {
                int leftPointer = leftCentre;
                int rightPointer = rightCentre;
                while (leftPointer >= 0 && rightPointer < inputStringLength) {
                    if (s.charAt(leftPointer) == s.charAt(rightPointer)) {
                        ++evenLengthPalindromesCount;
                        --leftPointer;
                        ++rightPointer;
                    } else {
                        break;
                    }
                }
            }
        }
        return evenLengthPalindromesCount;
    }
}
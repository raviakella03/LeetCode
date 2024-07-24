class Solution {
    public String reverseWords(String s) {
        String[] result = s.trim().replaceAll("\\s+", " ").split(" ");
        int left = 0;
        int right = result.length - 1;

        while (left < right) {
            String temp = result[left];
            result[left++] = result[right];
            result[right--] = temp;
        }

        return String.join(" ", result);
    }
}
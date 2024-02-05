class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> hashMap = new HashMap<>();
        int stringLength = s.length();
        for(int i = 0; i < stringLength; i++) {
            Character currentChar = s.charAt(i);
            hashMap.put(currentChar, hashMap.getOrDefault(currentChar, 0) + 1);
        }

        for(int i = 0; i < stringLength; i++) {
            Character currentChar = s.charAt(i);
            if(hashMap.containsKey(currentChar) && hashMap.get(currentChar) == 1) {
                return i;
            }
        }
        return -1;
    }
}
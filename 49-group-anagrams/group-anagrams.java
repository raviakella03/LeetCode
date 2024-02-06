class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hashMap = new HashMap<>();
        int inputLength = strs.length;
        for(int i = 0; i < inputLength; i++) {
            char[] stringArray = strs[i].toCharArray();
            Arrays.sort(stringArray);
            String key = String.valueOf(stringArray);
            List<String> value = hashMap.getOrDefault(key, new ArrayList<>());
            value.add(strs[i]);
            hashMap.put(key, value);
        }
        return new ArrayList<List<String>>(hashMap.values());
    }
}
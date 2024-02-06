class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hashMap = new HashMap<>();
        List<List<String>> anagrams = new ArrayList<>();
        int inputLength = strs.length;
        for(int i = 0; i < inputLength; i++) {
            char[] stringArray = strs[i].toCharArray();
            Arrays.sort(stringArray);
            String key = String.valueOf(stringArray);
            List<String> value = hashMap.getOrDefault(key, new ArrayList<>());
            value.add(strs[i]);
            hashMap.put(key, value);
        }

        for(String key: hashMap.keySet()) {
            anagrams.add(hashMap.get(key));
        }
        return anagrams;
    }
}
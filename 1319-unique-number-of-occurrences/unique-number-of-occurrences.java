class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        Set<Integer> hs = new HashSet<>();
        for(Integer occurrence : hm.values()) {
            if(hs.contains(occurrence)) {
                return false;
            }
            hs.add(occurrence);
        }
        return true;
    }
}
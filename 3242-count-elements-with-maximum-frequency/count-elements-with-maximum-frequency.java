class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxFreq = Integer.MIN_VALUE;
        int result = 0;

        for(int i = 0; i < nums.length; i++) {
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
            maxFreq = Math.max(maxFreq, freqMap.get(nums[i]));
        }

        for(Integer key: freqMap.keySet()) {
            if(freqMap.get(key) == maxFreq) {
                result += maxFreq;
            }
        }

        return result;
    }
}
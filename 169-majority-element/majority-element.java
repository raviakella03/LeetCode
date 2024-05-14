class Solution {
    public int majorityElement(int[] nums) {
        int majorityElementIndex = 0;
        int majorityCount = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[majorityElementIndex] == nums[i]) {
                ++majorityCount;
            } else {
                --majorityCount;
            }

            if (majorityCount == 0) {
                majorityElementIndex = i;
                majorityCount = 1;
            }
        }
        return nums[majorityElementIndex];
    }
}
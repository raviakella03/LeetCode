class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int ipLen = nums.length;
        int currMaxSum = 0;
        for (int i = 0; i < ipLen; i++) {
            currMaxSum += nums[i];
            if (maxSum < currMaxSum) {
                maxSum = currMaxSum;
            }

            if (currMaxSum < 0) {
                currMaxSum = 0;
            }
        }
        return maxSum;
    }
}
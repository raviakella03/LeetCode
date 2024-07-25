class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int result = 0;
        int temp = 0;

        for (int i = 0; i < k; i++) {
            temp += nums[i];
        }

        result = temp;

        for (int i = k; i < n; i++) {
            temp = temp - nums[i - k] + nums[i];
            result = Math.max(result, temp);
        }

        return ((double)result) / k;
    }
}
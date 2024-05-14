class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(k == 0) {
            return;
        }
        reverseArray(nums, 0, nums.length - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, nums.length - 1);
    }

    private void reverseArray(int[] nums, int leftIndex, int rightIndex) {
        while (leftIndex < rightIndex) {
            nums[leftIndex] = nums[leftIndex] + nums[rightIndex];
            nums[rightIndex] = nums[leftIndex] - nums[rightIndex];
            nums[leftIndex] = nums[leftIndex] - nums[rightIndex];
            ++leftIndex;
            --rightIndex;
        }
    }
}
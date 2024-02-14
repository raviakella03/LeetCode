class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        int count = 0;
        while (i <= j) {
            if (nums[i] == val) {
                ++count;
                swap(nums, i, j);
                --j;
            } else {
                ++i;
            }
        }
        return nums.length - count;
    }

    private void swap(int[] nums, int i, int j) {
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }
}
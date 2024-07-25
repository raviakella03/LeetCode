class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        if(n < 3) {
            return false;
        }

        if(n == 3) {
            return nums[0] < nums[1] && nums[1] < nums[2];
        }

        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num < i) {
                i = num;
            }

            if(num > i) {
                j = Math.min(j, num);
            }

            if(num > j) {
                return true;
            }
        }
        return false;
    }
}
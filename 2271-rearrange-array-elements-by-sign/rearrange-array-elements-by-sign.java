class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ipLen = nums.length;
        int[] result = new int[ipLen];
        int odd = 1;
        int even = 0;
        for(int i = 0; i < ipLen; i++) {
            if(nums[i] > 0) {
                result[even] = nums[i];
                even += 2;
            } else if(nums[i] < 0) {
                result[odd] = nums[i];
                odd +=2;
            }
        }
        return result;
    }
}
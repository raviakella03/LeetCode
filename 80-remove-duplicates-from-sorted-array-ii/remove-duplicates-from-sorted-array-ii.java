class Solution {
    public int removeDuplicates(int[] nums) {
        // int i = 0;
        // int j = 0;
        // int count;
        // while(j < nums.length) {
        //     count = 1;
        //     while(j < nums.length - 1 && nums[j] == nums[j + 1]) {
        //         ++j;
        //         ++count;
        //     }

        //     count = Math.min(2, count);
        //     while(count > 0) {
        //         nums[i] = nums[j];
        //         ++i;
        //         --count;
        //     }
        //     ++j;
        // }
        // return i;
        int k = 2;
        for(int i = 2; i < nums.length; i++){
            if(nums[i] != nums[k-2]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
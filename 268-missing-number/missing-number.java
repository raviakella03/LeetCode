class Solution {
    public int missingNumber(int[] nums) {
        int ipLen = nums.length;
        // int returnVal = -1;
        // for(int i = 0; i < ipLen; ) {
        //     if(nums[i] == i) {
        //         ++i;
        //     } else {
        //         if(nums[i] < ipLen) {
        //             int tmp = nums[i];
        //             nums[i] = nums[tmp];
        //             nums[tmp] = tmp;
        //         } else {
        //             ++i;
        //         }
        //     }
        // }

        // for(int i = 0; i < ipLen; i++) {
        //     if(nums[i] != i) {
        //         returnVal = i;
        //         break;
        //     }
        // }
        // return returnVal == -1 ? ipLen : returnVal;

        for(int i = 0; i < ipLen; i++) {
            while(nums[i] >= 0 && nums[i] <= ipLen && nums[i] != i) {
                int current = nums[i];
                if(current < ipLen) {
                    if(current == nums[current]) {
                        break;
                    }
                    nums[i] = nums[current];
                    nums[current] = current;
                } else {
                    break;
                }
            }
        }

        for(int i = 0; i < ipLen; i++) {
            if(nums[i] != i) {
                return i;
            }
        }
        return ipLen;
    }
}
class Solution {
    public int[] sortedSquares(int[] nums) {
        int ipLen = nums.length;
        int[] res = new int[ipLen];
        int firstPosiPos = -1;
        int lastNegPos = -1;
        for (int i = 0; i < ipLen; i++) {
            if (nums[i] >= 0) {
                if (firstPosiPos == -1) {
                    firstPosiPos = i;
                }
            } else {
                lastNegPos = i;
            }
        }

        int i = 0;
        while (firstPosiPos != -1 && lastNegPos >= 0 && firstPosiPos < ipLen) {
            if (Math.abs(nums[lastNegPos]) > nums[firstPosiPos]) {
                res[i] = nums[firstPosiPos] * nums[firstPosiPos];
                ++firstPosiPos;
                ++i;
            } else {
                res[i] = nums[lastNegPos] * nums[lastNegPos];
                --lastNegPos;
                ++i;
            }
        }

        while (lastNegPos >= 0) {
            res[i] = nums[lastNegPos] * nums[lastNegPos];
            --lastNegPos;
            ++i;

        }

        while (firstPosiPos != -1 && firstPosiPos < ipLen) {
            res[i] = nums[firstPosiPos] * nums[firstPosiPos];
            ++firstPosiPos;
            ++i;
        }
        return res;
    }
}
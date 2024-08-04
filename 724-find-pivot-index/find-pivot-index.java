class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int[] pf = new int[len];
        int[] sf = new int[len];

        pf[0] = 0;
        pf[len-1] = 0;
        //2,1,-1
        //0,2,3
        //2,3,2
        for(int i = 1; i < nums.length; i++) {
            pf[i] = pf[i - 1] + nums[i - 1];
        }


        //2,1,-1
        //0,-1,0
        //2,1,2
        for(int i = nums.length - 2; i >= 0; i--) {
            sf[i] = sf[i + 1] + nums[i + 1];
        }

        for(int i = 0; i < nums.length; i++) {
            if(pf[i] == sf[i]) {
                return i;
            }
        }

        return -1;
    }
}
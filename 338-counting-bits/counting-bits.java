class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        result[0] = 0;
        for(int i = 1; i <= n; i ++) {
            int count = 0;
            for(int j = 0; j < 32; j++) {
                if(((1 << j) & i) != 0) {
                    ++count;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
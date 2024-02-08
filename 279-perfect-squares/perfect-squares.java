class Solution {
    public int numSquares(int n) {
        int[] dpArr = new int[n + 1];
        dpArr[0] = 0;
        for(int i = 1; i <= n;) {
            dpArr[i++] = i;
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                int numSqr = j * j;
                if(i - numSqr < 0) {
                    break;
                }
                dpArr[i] = Math.min(dpArr[i], dpArr[i - numSqr] + 1);
            }
        }
        return dpArr[n];
    }
}
class Solution {
    public int kthFactor(int n, int k) {
        int count = 0;
        int kthFactor = 0;
        for (int j = 1; count <= k + 1 && j <= n; j++) {
            if (n % j == 0) {
                if (++count == k && kthFactor == 0) {
                    kthFactor = j;
                }
            }
        }
        return count >= k ? kthFactor : -1;
    }
}
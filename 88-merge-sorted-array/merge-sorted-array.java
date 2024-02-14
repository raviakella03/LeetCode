class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] result = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < m && j < n) {
            if(nums2[j] < nums1[i]) {
                result[k] = nums2[j];
                ++j;
                ++k;
            } else {
                result[k] = nums1[i];
                ++i;
                ++k;
            }
        }
        while(i < m) {
            result[k] = nums1[i];
            ++i;
            ++k;
        }
        while(j < n) {
            result[k] = nums2[j];
            ++j;
            ++k;
        }
        i = 0;
        for(i = 0; i < nums1.length; i++) {
            nums1[i] = result[i];
        }
        // nums1 = Arrays.copyOf(result, m + n);
    }
}